/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Modelo.TableModels.TableModelBackups;
import Modelo.TableModels.BackUp;
import Modelo.OperacionesFicheros;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author rodrigo valdes
 */
public class MostrarBackups extends javax.swing.JDialog {

    private PantallaPrincipal parent;

    /**
     * Creates new form MostrarBackups
     */
    public MostrarBackups(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.parent = (PantallaPrincipal) parent;
        // Refrescamos los datos de la lista del controlador antes de utilizarlos para inicializar nuestro tableModel
        this.parent.getControlador().refrescarListaBackups();
        // Asignamos al jTable un tableModel de nuestro tipo
        TableModelBackups tableModelBackups = new TableModelBackups(this.parent.getControlador().getListaBackUps());
        jTable_backups.setModel(tableModelBackups);
        // Asignamos al jTable un objeto para poder ordenar por sus columnas el contenido
        TableRowSorter sorter = new TableRowSorter(tableModelBackups);
        jTable_backups.setRowSorter(sorter);

        SimpleDateFormat dateFormat = new SimpleDateFormat("DD-MM-YYYY hh:mm:ss");

        // El botón de aplicar opción estará inicialmente inhabilitado, hasta que escojamos una opción
        jButton_aplicarOpcion.setEnabled(false);
    }

    public JTable getjTable_backups() {
        return jTable_backups;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_backups = new javax.swing.JTable();
        jB_volver = new javax.swing.JButton();
        jComboBox_opciones = new javax.swing.JComboBox<>();
        jButton_aplicarOpcion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable_backups.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jTable_backups.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable_backups);

        jB_volver.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jB_volver.setForeground(new java.awt.Color(0, 102, 102));
        jB_volver.setText("Volver");
        jB_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_volverActionPerformed(evt);
            }
        });

        jComboBox_opciones.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jComboBox_opciones.setForeground(new java.awt.Color(0, 102, 102));
        jComboBox_opciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Opciones...", "Mostrar todos", "Buscar por fecha", "Restaurar", "Eliminar", "Buscar duplicados" }));
        jComboBox_opciones.setToolTipText("Opciones");
        jComboBox_opciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_opcionesActionPerformed(evt);
            }
        });

        jButton_aplicarOpcion.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jButton_aplicarOpcion.setForeground(new java.awt.Color(0, 102, 102));
        jButton_aplicarOpcion.setText("Aplicar selección");
        jButton_aplicarOpcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_aplicarOpcionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox_opciones, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_aplicarOpcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jB_volver)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_opciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_aplicarOpcion)
                    .addComponent(jB_volver))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_volverActionPerformed
        dispose();
    }//GEN-LAST:event_jB_volverActionPerformed

    private void jComboBox_opcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_opcionesActionPerformed
        // Si no se escoge una opción válida, se desactiva el botón de aplicar, y se activa cuando se escoge una opción
        if (jComboBox_opciones.getSelectedIndex() == 0) {
            jButton_aplicarOpcion.setEnabled(false);
        } else {
            jButton_aplicarOpcion.setEnabled(true);
        }
    }//GEN-LAST:event_jComboBox_opcionesActionPerformed

    private void jButton_aplicarOpcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_aplicarOpcionActionPerformed
        switch (jComboBox_opciones.getSelectedIndex()) {
            case 1:
            TableRowSorter rowSorter = (TableRowSorter) jTable_backups.getRowSorter();
            rowSorter.setRowFilter(null);
            break;
            case 2:
//            // FILTRAR POR FECHA
//            EscogerFecha pantallaEscogerFecha = new EscogerFecha(this, true); // Esta sí la hacemos modal
//            pantallaEscogerFecha.setVisible(true);
//            // Sacamos la fecha elegida del nuevo jDialog, que se habrá puesto setVisible(false) al dar aceptar en su ventana
//            filtrarPorFechaElegida(pantallaEscogerFecha);
//            // Cerramos la ventana emergente que había quedado visible(false)
//            pantallaEscogerFecha.dispose();
            break;
            case 3:
            // RESTAURAR
            restaurarBackupsSeleccionados();
            break;
            case 4:
            // ELIMINAR
            eliminarBackupsSeleccionados();
            break;
            case 5:
            // VER DUPLICADOS
            mostrarDuplicadosBackupSeleccionado();
            break;
        }
    }//GEN-LAST:event_jButton_aplicarOpcionActionPerformed
  public void refrescarTabla() {
        // Hay que declarar primero la variable para castearla, si no no podemos usar el método propio de nuestra 
        // clase TablaContactos porque lo trata como un TableMode y no aparecen los métodos de la clase hija
        TableModelBackups tableModel = (TableModelBackups) jTable_backups.getModel();
        tableModel.refrescar();
    }

    
  
  public void filtrarPorFechaElegida(EscogerFecha pantallaEscogerFecha) {
        Date fechaElegida = (Date) pantallaEscogerFecha.getjSpinner_fecha().getValue();
        // RowFilter.dateFilter(RowFilter.ComparisonType.EQUAL, fechaElegida, 0) nos compara si es idéntica la fecha (con horas, minutos, segundos)
        // Además NO DEVOLVEMOS LA FECHA COMO DATE EN EL TABLEMODEL, la devolvemos formateada como String

        // Usamos una expresión regular
        // En el tableModel devolvemos la fecha con el formato: "E dd/MM/YYYY HH:mm:ss" 
        // habrá que buscar que empiece por la subcadena "E dd/MM/YYYY"
        // y luego se adapte más o menos a la forma de 00:00:00 de hh:mm:ss
        // (no comprobamos que no pase de 23h,59min,59seg, no nos es necesario tanto detalle en este caso)
        SimpleDateFormat dateFormat = new SimpleDateFormat("E dd/MM/YYYY");
        String fechaElegidaFormateada = dateFormat.format(fechaElegida);
        String patronFechaElegida = "^" + fechaElegidaFormateada + "{1}\\s[0-9]{2}:[0-9]{2}:[0-9]{2}";

        // Asignamos al TableRowSorter del jTable un filtro para la fecha elegida
        TableRowSorter rowSorter = (TableRowSorter) jTable_backups.getRowSorter();
        rowSorter.setRowFilter(RowFilter.regexFilter(patronFechaElegida, 0));
    }

    public void mostrarDuplicadosBackupSeleccionado() {
        if (jTable_backups.getSelectedRows().length == 0) {
            JOptionPane.showMessageDialog(this, "No hay ningún backup seleccionado", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (jTable_backups.getSelectedRows().length > 1) {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona sólo un backup", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            MostrarDuplicados pantallaDuplicados = new MostrarDuplicados(this, false);
            pantallaDuplicados.setVisible(true);
        }
    }

    public void eliminarBackupsSeleccionados() {
        // Sacamos los índices de todas las filas seleccionadas en el jTable
        int[] filasSeleccionadasJTable = jTable_backups.getSelectedRows();
        int[] filasSeleccionadasModelo = new int[filasSeleccionadasJTable.length];

        if (filasSeleccionadasJTable.length == 0) {
           JOptionPane.showMessageDialog(this, "No hay ningún backup seleccionado", "", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                int confirmacion = JOptionPane.showConfirmDialog(this, "Los backups seleccionados se eliminarán de manera permanente.\n¿Seguro que deseas continuar?", "", JOptionPane.OK_CANCEL_OPTION);
                // Si ha contestado aceptar, eliminamos las filas
                if (confirmacion == JOptionPane.OK_OPTION) {
                    // Sacamos los índices equivalentes en el TableModel (al ordenar el jTable, no coincidirán)
                    for (int i = 0; i < filasSeleccionadasJTable.length; i++) {
                        filasSeleccionadasModelo[i] = jTable_backups.convertRowIndexToModel(filasSeleccionadasJTable[i]);
                    }
                    // Sacamos el tableModel de nuestra jTable
                    TableModelBackups tableModel = (TableModelBackups) jTable_backups.getModel();
                    // Borramos los directorios padre de los backups asociados a esas filas con todo su contenido
                    for (int i : filasSeleccionadasModelo) {
                        String nombreDirectorioPadreBackup = tableModel.getRow(i).getNombreDirectorioCreado();
                        File directorioPadreBackup = new File(nombreDirectorioPadreBackup);
                        OperacionesFicheros.eliminarDirectorioConContenido(directorioPadreBackup);
                    }
                  tableModel.removeRows(filasSeleccionadasModelo);
                }
                refrescarTabla();

                this.parent.getControlador().actualizarRegistroBackups();
            } catch (IOException ex) {
                Logger.getLogger(MostrarBackups.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void restaurarBackupsSeleccionados() {
        // Sacamos los índices de todas las filas seleccionadas en el jTable
        int[] filasSeleccionadasJTable = jTable_backups.getSelectedRows();
        int[] filasSeleccionadasModelo = new int[filasSeleccionadasJTable.length];

        if (filasSeleccionadasJTable.length == 0) {
            // Si el array devuelto está vacío (no hay ninguna fila seleccionada) mostramos un aviso
            JOptionPane.showMessageDialog(this, "No hay ningún backup seleccionado", "", JOptionPane.ERROR_MESSAGE);
        } else {
            int confirmacion = JOptionPane.showConfirmDialog(this, "Esta operación podría eliminar algunos ficheros existentes en tu dispositivo.\n¿Seguro que deseas continuar?", "", JOptionPane.OK_CANCEL_OPTION);
            if (confirmacion == JOptionPane.OK_OPTION) {
               for (int i = 0; i < filasSeleccionadasJTable.length; i++) {
                    filasSeleccionadasModelo[i] = jTable_backups.convertRowIndexToModel(filasSeleccionadasJTable[i]);
                }
                // Restauramos cada uno de los backups seleccionados

                for (int i : filasSeleccionadasModelo) {
                    TableModelBackups tableModel = (TableModelBackups) jTable_backups.getModel();
                    BackUp backup = tableModel.getRow(i);
                    try {
                        OperacionesFicheros.restaurarFicherosCopiados(backup);
                    } catch (IOException ex) {
                        Logger.getLogger(MostrarBackups.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            // Refrescamos la tabla para que cargue la información actualizada tras borrar
            refrescarTabla();
            try {
                // Actualizamos los datos persistidos por el controlador
                this.parent.getControlador().actualizarRegistroBackups();
            } catch (IOException ex) {
                Logger.getLogger(MostrarBackups.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_volver;
    private javax.swing.JButton jButton_aplicarOpcion;
    private javax.swing.JComboBox<String> jComboBox_opciones;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_backups;
    // End of variables declaration//GEN-END:variables

   
}
