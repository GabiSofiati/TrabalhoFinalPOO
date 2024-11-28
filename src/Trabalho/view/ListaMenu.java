/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabalho.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author Paulo Fontenele da Silva
 */
public class ListaMenu<E extends Object> extends JList<E> {

    private final DefaultListModel model;
    private Color selectedColor;
    private Color hoverColor;
    private int hoverIndex = -1;

    public ListaMenu() {
        model = new DefaultListModel();
        selectedColor = new Color(255,255,255);
        hoverColor = new Color(220,220,220);
        setModel(model);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                hoverIndex = -1;
                repaint();
            }
        });
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                checkMouse(e);
            }
        });
        
    }
    
    private void checkMouse(MouseEvent e){
        Point p = e.getPoint();
        int index = locationToIndex(p);
        if(index != hoverIndex){
            hoverIndex = index;
            repaint();
        }
    }

    @Override
    public ListCellRenderer<? super E> getCellRenderer() {
        return new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object o, int index, boolean isSelected, boolean cellHasFocus) {
                ItemMenuLista item = new ItemMenuLista();
                item.setItem(o);
                item.setBackground(ListaMenu.this.getBackground());
                item.setSelected(isSelected);
                if(index == hoverIndex){
                    item.setBackground(getHoverColor());
                }
                if(isSelected){
                    item.setBackground(selectedColor);
                }
                return item;
            }
        };
    }
    public void addItem(ItemMenu item) {
        model.addElement(item);
    }

    public Color getSelectedColor() {
        return selectedColor;
    }

    public void setSelectedColor(Color selectedColor) {
        this.selectedColor = selectedColor;
    }

    public Color getHoverColor() {
        return hoverColor;
    }

    public void setHoverColor(Color hoverColor) {
        this.hoverColor = hoverColor;
    }

}
