/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg05.gui.pkg03.tresenraya;

import java.awt.Color;
import java.awt.Graphics;


/**
 *
 * @author m
 */
public class InterfaceJuego extends javax.swing.JFrame {


private int turno=0;
private int movimientos=0;

private boolean click1=false;
private boolean click2=false;
private boolean click3=false;
private boolean click4=false;
private boolean click5=false;
private boolean click6=false;
private boolean click7=false;
private boolean click8=false;
private boolean click9=false;

private int[][] array={{5,5,5},{5,5,5},{5,5,5}};
int i;
int j;



	public int getMovimientos() {
		return movimientos;
	}

	public void setMovimientos(int movimientos) {
		this.movimientos = movimientos;
	}

	public void setTurno(int turno) {
		this.turno = turno;
	}

	public void setArray(int[][] array) {
		this.array = array;
	}

	public int[][] getArray() {
		return array;
	}

	public void setClick1(boolean click1) {
		this.click1 = click1;
	}

	public void setClick2(boolean click2) {
		this.click2 = click2;
	}

	public void setClick3(boolean click3) {
		this.click3 = click3;
	}

	public void setClick4(boolean click4) {
		this.click4 = click4;
	}

	public void setClick5(boolean click5) {
		this.click5 = click5;
	}

	public void setClick6(boolean click6) {
		this.click6 = click6;
	}

	public void setClick7(boolean click7) {
		this.click7 = click7;
	}

	public void setClick8(boolean click8) {
		this.click8 = click8;
	}

	public void setClick9(boolean click9) {
		this.click9 = click9;
	}









/**
 * Creates new form InterfaceJuego
 */
public InterfaceJuego() {
	initComponents();
	
}



/**
 * This method is called from within the constructor to initialize the form.
 * WARNING: Do NOT modify this code. The content of this method is always
 * regenerated by the Form Editor.
 */
@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel11 = new javax.swing.JPanel();
                jPanel1 = new javax.swing.JPanel();
                jPanel2 = new javax.swing.JPanel();
                jPanel3 = new javax.swing.JPanel();
                jPanel4 = new javax.swing.JPanel();
                jPanel5 = new javax.swing.JPanel();
                jPanel6 = new javax.swing.JPanel();
                jPanel7 = new javax.swing.JPanel();
                jPanel8 = new javax.swing.JPanel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setTitle("Tres en Raya");
                setBackground(new java.awt.Color(72, 178, 211));
                setResizable(false);
                getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jPanel11.setBackground(new java.awt.Color(19, 37, 43));
                jPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                jPanel11MouseClicked(evt);
                        }
                });

                javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
                jPanel11.setLayout(jPanel11Layout);
                jPanel11Layout.setHorizontalGroup(
                        jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 290, Short.MAX_VALUE)
                );
                jPanel11Layout.setVerticalGroup(
                        jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
                );

                getContentPane().add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 300));

                jPanel1.setBackground(jPanel11.getBackground());
                jPanel1.setPreferredSize(new java.awt.Dimension(300, 300));
                jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                jPanel1MouseClicked(evt);
                        }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 290, Short.MAX_VALUE)
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
                );

                getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 290, 300));

                jPanel2.setBackground(jPanel11.getBackground());
                jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                jPanel2MouseClicked(evt);
                        }
                });

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
                );
                jPanel2Layout.setVerticalGroup(
                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
                );

                getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 300, 300));

                jPanel3.setBackground(jPanel11.getBackground());
                jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                jPanel3MouseClicked(evt);
                        }
                });

                javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
                jPanel3.setLayout(jPanel3Layout);
                jPanel3Layout.setHorizontalGroup(
                        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 290, Short.MAX_VALUE)
                );
                jPanel3Layout.setVerticalGroup(
                        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
                );

                getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 290, 300));

                jPanel4.setBackground(jPanel11.getBackground());
                jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                jPanel4MouseClicked(evt);
                        }
                });

                javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
                jPanel4.setLayout(jPanel4Layout);
                jPanel4Layout.setHorizontalGroup(
                        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 290, Short.MAX_VALUE)
                );
                jPanel4Layout.setVerticalGroup(
                        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
                );

                getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 290, 300));

                jPanel5.setBackground(jPanel11.getBackground());
                jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                jPanel5MouseClicked(evt);
                        }
                });

                javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
                jPanel5.setLayout(jPanel5Layout);
                jPanel5Layout.setHorizontalGroup(
                        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
                );
                jPanel5Layout.setVerticalGroup(
                        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
                );

                getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, 300, 300));

                jPanel6.setBackground(jPanel11.getBackground());
                jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                jPanel6MouseClicked(evt);
                        }
                });

                javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
                jPanel6.setLayout(jPanel6Layout);
                jPanel6Layout.setHorizontalGroup(
                        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 290, Short.MAX_VALUE)
                );
                jPanel6Layout.setVerticalGroup(
                        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 270, Short.MAX_VALUE)
                );

                getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, 290, 270));

                jPanel7.setBackground(jPanel11.getBackground());
                jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                jPanel7MouseClicked(evt);
                        }
                });

                javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
                jPanel7.setLayout(jPanel7Layout);
                jPanel7Layout.setHorizontalGroup(
                        jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 290, Short.MAX_VALUE)
                );
                jPanel7Layout.setVerticalGroup(
                        jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 270, Short.MAX_VALUE)
                );

                getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 630, 290, 270));

                jPanel8.setBackground(jPanel11.getBackground());
                jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                jPanel8MouseClicked(evt);
                        }
                });

                javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
                jPanel8.setLayout(jPanel8Layout);
                jPanel8Layout.setHorizontalGroup(
                        jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
                );
                jPanel8Layout.setVerticalGroup(
                        jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 270, Short.MAX_VALUE)
                );

                getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 630, 300, 270));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void jPanel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseClicked
	
	Graphics g=jPanel11.getGraphics();
	g.setColor(Color.white);	
	if (turno==0 && click1==false){
	g.drawOval(75, 75, 150, 150);
        g.fi
        array[0][0]=0;
	if (Gui03TresEnRaya.hayGanador(array)){Gui03TresEnRaya.ganaO();}
	turno++;
	movimientos++;
	}else if (turno==1 && click1==false){g.drawLine(20, 20, 250, 250);
	g.drawLine(250, 20, 20, 250);
	array[0][0]=1;
	if (Gui03TresEnRaya.hayGanador(array)){Gui03TresEnRaya.ganaX();}
	turno--;
	movimientos++;
	}
	
	click1=true;
	
	Gui03TresEnRaya.comprobarEmpate();
	
	
	
	
		
        }//GEN-LAST:event_jPanel11MouseClicked

        private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        Graphics g=jPanel1.getGraphics();
	g.setColor(Color.white);	
	if(this.turno==0 && click2==false){
	g.drawOval(75, 75, 150, 150);
	array[0][1]=0;
	if (Gui03TresEnRaya.hayGanador(array)){Gui03TresEnRaya.ganaO();}
	turno++;
	movimientos++;
	}else if(this.turno==1 && click2==false){g.drawLine(20, 20, 250, 250);
	g.drawLine(250, 20, 20, 250);
	if (Gui03TresEnRaya.hayGanador(array)){Gui03TresEnRaya.ganaX();}
	array[0][1]=1;
	turno--;
	movimientos++;}
	click2=true;
	
	Gui03TresEnRaya.comprobarEmpate();
        }//GEN-LAST:event_jPanel1MouseClicked

        private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        Graphics g=jPanel2.getGraphics();
	g.setColor(Color.white);	
	if(this.turno==0 && click3==false){
	g.drawOval(75, 75, 150, 150);
	array[0][2]=0;
	if (Gui03TresEnRaya.hayGanador(array)){Gui03TresEnRaya.ganaO();}
	turno++;
	movimientos++;
	}else if(this.turno==1 && click3==false){g.drawLine(20, 20, 250, 250);
	g.drawLine(250, 20, 20, 250);
	array[0][2]=1;
	if (Gui03TresEnRaya.hayGanador(array)){Gui03TresEnRaya.ganaX();}
	turno--;
	movimientos++;}
	click3=true;
	
	Gui03TresEnRaya.comprobarEmpate();
        }//GEN-LAST:event_jPanel2MouseClicked

        private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        Graphics g=jPanel3.getGraphics();
	g.setColor(Color.white);	
	if(this.turno==0 && click4==false){
	g.drawOval(75, 75, 150, 150);
	array[1][0]=0;
	if (Gui03TresEnRaya.hayGanador(array)){Gui03TresEnRaya.ganaO();}
	turno++;
	movimientos++;
	}else if(this.turno==1 && click4==false){g.drawLine(20, 20, 250, 250);
	g.drawLine(250, 20, 20, 250);
	if (Gui03TresEnRaya.hayGanador(array)){Gui03TresEnRaya.ganaX();}
	array[1][0]=1;
	turno--;
	movimientos++;}
	click4=true;
	
	Gui03TresEnRaya.comprobarEmpate();
        }//GEN-LAST:event_jPanel3MouseClicked

        private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        Graphics g=jPanel4.getGraphics();
	g.setColor(Color.white);	
	if(this.turno==0 && click5==false){
	g.drawOval(75, 75, 150, 150);
	array[1][1]=0;
	if (Gui03TresEnRaya.hayGanador(array)){Gui03TresEnRaya.ganaO();}
	turno++;
	movimientos++;
	}else if(this.turno==1 && click5==false){g.drawLine(20, 20, 250, 250);
	g.drawLine(250, 20, 20, 250);
	array[1][1]=1;
	if (Gui03TresEnRaya.hayGanador(array)){Gui03TresEnRaya.ganaX();}
	turno--;
	movimientos++;}
	click5=true;
	
	Gui03TresEnRaya.comprobarEmpate();
        }//GEN-LAST:event_jPanel4MouseClicked

        private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        Graphics g=jPanel5.getGraphics();
	g.setColor(Color.white);	
	if(this.turno==0 && click6==false){
	g.drawOval(75, 75, 150, 150);
	array[1][2]=0;
	if (Gui03TresEnRaya.hayGanador(array)){Gui03TresEnRaya.ganaO();}
	turno++;
	movimientos++;
	}else if(this.turno==1 && click6==false){g.drawLine(20, 20, 250, 250);
	g.drawLine(250, 20, 20, 250);
	array[1][2]=1;
	if (Gui03TresEnRaya.hayGanador(array)){Gui03TresEnRaya.ganaX();}
	turno--;
	movimientos++;}
	click6=true;
	
	Gui03TresEnRaya.comprobarEmpate();
        }//GEN-LAST:event_jPanel5MouseClicked

        private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        Graphics g=jPanel6.getGraphics();
	g.setColor(Color.white);	
	if(this.turno==0 && click7==false){
	g.drawOval(75, 75, 150, 150);
	array[2][0]=0;
	if (Gui03TresEnRaya.hayGanador(array)){Gui03TresEnRaya.ganaO();}
	turno++;
	movimientos++;
	}else if(this.turno==1 && click7==false){g.drawLine(20, 20, 250, 250);
	g.drawLine(250, 20, 20, 250);
	array[2][0]=1;
	if (Gui03TresEnRaya.hayGanador(array)){Gui03TresEnRaya.ganaX();}
	turno--;
	movimientos++;}
	click7=true;
	
	Gui03TresEnRaya.comprobarEmpate();
        }//GEN-LAST:event_jPanel6MouseClicked

        private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        Graphics g=jPanel7.getGraphics();
	g.setColor(Color.white);	
	if(this.turno==0 && click8==false){
	g.drawOval(75, 75, 150, 150);
	array[2][1]=0;
	if (Gui03TresEnRaya.hayGanador(array)){Gui03TresEnRaya.ganaO();}
	turno++;
	movimientos++;
	}else if(this.turno==1 && click8==false){g.drawLine(20, 20, 250, 250);
	g.drawLine(250, 20, 20, 250);
	array[2][1]=1;
	if (Gui03TresEnRaya.hayGanador(array)){Gui03TresEnRaya.ganaX();}
	turno--;
	movimientos++;}
	click8=true;
	
	Gui03TresEnRaya.comprobarEmpate();
        }//GEN-LAST:event_jPanel7MouseClicked

        private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
        Graphics g=jPanel8.getGraphics();
	g.setColor(Color.white);	
	if(this.turno==0 && click9==false){
	g.drawOval(75, 75, 150, 150);
	array[2][2]=0;
	if (Gui03TresEnRaya.hayGanador(array)){Gui03TresEnRaya.ganaO();}
	turno++;
	movimientos++;
	}else if(this.turno==1 && click9==false){g.drawLine(20, 20, 250, 250);
	g.drawLine(250, 20, 20, 250);
	array[2][2]=1;
	if (Gui03TresEnRaya.hayGanador(array)){Gui03TresEnRaya.ganaX();}
	turno--;
	movimientos++;}
	click9=true;
	
	Gui03TresEnRaya.comprobarEmpate();
        }//GEN-LAST:event_jPanel8MouseClicked

/**
 * @param args the command line arguments
 */


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel11;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JPanel jPanel3;
        private javax.swing.JPanel jPanel4;
        private javax.swing.JPanel jPanel5;
        private javax.swing.JPanel jPanel6;
        private javax.swing.JPanel jPanel7;
        private javax.swing.JPanel jPanel8;
        // End of variables declaration//GEN-END:variables
}
