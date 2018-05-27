package moves;

import javax.swing.table.DefaultTableModel;

class NotEditableTableModel extends DefaultTableModel {
	
  NotEditableTableModel() {}
  
  public boolean isCellEditable(int a, int b) {
    return false;
  }
  
}
