/*
Copyright 2016 Cristian Velez Ruiz universidadcvr@gmail.com
Copyright 2016 Jorge Gutierrez Segovia

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program. If not, see <http://www.gnu.org/licenses/>. 
*/
package GUI;

import NapakalakiGame.Treasure;
import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;


/**
 *
 * @author saytes
 */
public class TreasureView extends javax.swing.JPanel {

    /**
     * Creates new form TreasureView
     */
    private Treasure treasureModel;
    private boolean selected = false;
    
    public TreasureView() {
      
        initComponents();
    }

    public boolean isSelected(){
        return selected;
    }
    
    public void setTreasure(Treasure t){
        treasureModel = t;
        this.name.setText(treasureModel.getName());
        this.bonus.setText(Integer.toString(treasureModel.getBonus()));
        this.type.setText(treasureModel.getType().toString());
        
        ImageIcon i = new ImageIcon(treasureModel.getDire());
        Icon icono = new ImageIcon(i.getImage().getScaledInstance(img1.getWidth()+58, img1.getHeight()+58, Image.SCALE_DEFAULT));
        img1.setIcon(icono);
        repaint();
        
    }
    
    public Treasure getTreasure(){
       return treasureModel;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name = new javax.swing.JLabel();
        bonus = new javax.swing.JLabel();
        type = new javax.swing.JLabel();
        img1 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name.setText("jLabel1");

        bonus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bonus.setText("jLabel2");

        type.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bonus, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(img1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(img1, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bonus)
                    .addComponent(type)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
             
       if (!isSelected()){
           selected = true;
           setBackground(Color.green);
           setOpaque(selected);
       }else{
          selected = false;
          setOpaque(selected);
       }
       
       repaint();
    }//GEN-LAST:event_formMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bonus;
    private javax.swing.JLabel img1;
    private javax.swing.JLabel name;
    private javax.swing.JLabel type;
    // End of variables declaration//GEN-END:variables
}
