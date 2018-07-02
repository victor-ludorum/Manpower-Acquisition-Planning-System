/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphtheoryproject;

import java.awt.BorderLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.ui.view.View;
import org.graphstream.ui.view.Viewer;
/**
 *
 * @author SURYA PRIY
 */
public class InputPage extends javax.swing.JFrame
{
    static int count=0;
    static ArrayList<Vertex> vertexlist = new ArrayList<>();
    static ArrayList<Edge> edgelist = new ArrayList<>();
    static HashMap<Integer, Vertex> vertexmap= new HashMap<Integer, Vertex>();
    static HashMap<Integer,Integer > edgemap = new HashMap<Integer,Integer>();
    
    ArrayList< ArrayList<Edge> > subgraphlist=null;
    Graph graph;
    /**
     * Creates new form InputPage
     */
    public InputPage()
    {
        initComponents();
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        graph=new SingleGraph("InputGraph");
        
    }
    
    void refreshMenu()
    {
        Vertex v=vertexlist.get(vertexlist.size()-1);
        list1.addItem(v.getNodeNo());
        list2.addItem(v.getNodeNo());
        
    }
     
    
    void showGraph()
    {
        jPanel1.removeAll();
        graph.addAttribute("ui.stylesheet",styleSheet);
        graph.addAttribute("ui.antialias");
     //       graph.setAutoCreate(true);
     //       graph.setStrict(false);             
        
        
        for (Node node : graph) 
        {
            node.addAttribute("ui.label", node.getId());
        }
       
        
        Viewer viewer = new Viewer(graph, Viewer.ThreadingModel.GRAPH_IN_GUI_THREAD);
        View view = viewer.addDefaultView(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Activate autolayout here : 
        viewer.enableAutoLayout();
       
        JInternalFrame sgf=new JInternalFrame();
        sgf.setSize(jPanel1.getSize());
        sgf.setLayout(new BorderLayout());
        
        sgf.add((Component) view, BorderLayout.CENTER);
        
        sgf.setVisible(true);
        jPanel1.add(sgf);
    }
    
    
    void updateGraph(Vertex v)
    {
        if(graph.getNode(Integer.toString(v.getNodeNo()))==null)
        {
            graph.addNode(Integer.toString(v.getNodeNo()));
        }
        showGraph();
    }
    
    void updateGraph(Edge e)
    {
        graph.addEdge(Integer.toString(edgelist.size()),Integer.toString(e.getV1().getNodeNo()),Integer.toString(e.getV2().getNodeNo()));
        showGraph();
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jDialog1 = new javax.swing.JDialog();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        list1 = new javax.swing.JComboBox();
        list2 = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("CREATE NODE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Nodes:");

        jButton2.setText("ADD EDGE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("GENERATE SUBGRAPHS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 887, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 464, Short.MAX_VALUE)
        );

        jButton4.setText("EXIT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setText("Total number of nodes = 0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(list2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(list1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(list1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addComponent(list2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        jPopupMenu1.setVisible(false);
        Vertex ver=new Vertex();
        count++;
        ver.setNodeNo(count);
        
        vertexlist.add(ver);
        vertexmap.put(count, ver);
        updateGraph(ver);
        refreshMenu();
        if(vertexlist.size()>=2)
        {
            jButton2.setEnabled(true);
        }
        jLabel1.setText("Total number of nodes= "+vertexlist.size());
    // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton2ActionPerformed
    {//GEN-HEADEREND:event_jButton2ActionPerformed
        int n1=Integer.parseInt(list1.getSelectedItem().toString());
        int n2=Integer.parseInt(list2.getSelectedItem().toString());
        /**
         * Here edgemap is used to check parallel edges as if the edge is present 
         * previously or not whether vertex1 is connected to vertex2 or vertex2 
         * is connected to vertex1 .
         */
        int mp=-1,bp=-1;
        if(edgemap.get(n2)!= null) 
          mp = edgemap.get(n2);
        if(edgemap.get(n1)!= null)
          bp = edgemap.get(n1);
        if(n1==n2)
        {    
          JOptionPane.showMessageDialog(this,"Self loop is not allowed ");             
        }
        else if( mp==n1 || bp==n2)
        { 
          JOptionPane.showMessageDialog(this,"Parallel edges are not allowed ");                         
        }
        else
        {
            jPopupMenu1.setVisible(false);
            
             if(jButton3.isEnabled()==false)
             jButton3.setEnabled(true);
                    
            edgemap.put(n1,n2); edgemap.put(n2,n1);
        Vertex v1= vertexmap.get(n1);
        Vertex v2= vertexmap.get(n2);
        
        Edge edge=new Edge();
        edge.setV1(v1);
        edge.setV2(v2);
        
        edgelist.add(edge);
        updateGraph(edge);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton3ActionPerformed
    {//GEN-HEADEREND:event_jButton3ActionPerformed
        
        subgraphlist= new Subgraph().generateSubgraphs(edgelist); //amit's
        System.out.println("********************************************");
        System.out.println("subgraphlist size="+subgraphlist.size());
        for(ArrayList<Edge> e:subgraphlist)
        {
            System.out.println("edge size="+e.size());
        }
        System.out.println("********************************************");
        OutputPage op=new OutputPage(vertexlist, subgraphlist);
        
        

// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    
    protected String styleSheet =
            "node {" +
            "	fill-color: rgb(65,198,100) , rgb(50,198,20);" +
            "}" +
            "node {" +
            "	fill-mode: gradient-horizontal;" +
            "}" +            
            "node.marked {" +
            "	fill-color: rgb(120,198,20) , rgb(50,198,20);" +
            "}" +
            "node {" +
            "	shape: circle;" +
            "}" +
            "node {" +
            "	size: 30px;" +
            "}" +
            "node {" +
            "	size-mode: fit;" +
            "}" +                
            "node {" +
            "	text-color: blue;" +
            "}" +
            "node {" +
            "	text-size: 30px;" +
            "}" +
            "node {" +
            "	arrow-shape: circle;" +
            "}" +
            "node {" +
            "	shadow-mode: gradient-diagonal1;" +
            "}" +                
            "node {" +
            "	shadow-color: red , yellow;" +
            "}" +
            "node {" +
            "	shadow-width: 4px;" +
            "}" +                
            "node {" +
            "	text-alignment:at-left ;" +
            "}" +
            "node {" +
            "	text-style: bold-italic;" +
            "}" +
            "edge {" +
            "	size: 8px;" +
            "}" +
            "edge {" +
            "	fill-color: rgb(56,100,60);" +
            "}" +               
            "edge {" +
            "	shape: blob;" +
            "}" +           
            "edge {" +
            "	arrow-shape: diamond;" +
            "}";                
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(InputPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(InputPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(InputPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(InputPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new InputPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JComboBox list1;
    private javax.swing.JComboBox list2;
    // End of variables declaration//GEN-END:variables
}
