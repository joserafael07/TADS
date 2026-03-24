package view;

import controller.ClienteDAO;
import controller.UsuarioDAO;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import model.Cliente;
import model.Usuario;

/**
 *
 * @author clebe
 */
public class TelaCliente1 extends javax.swing.JFrame {

    /**
     * Creates new form TelaCliente
     */
    public TelaCliente1() {
        initComponents();
    }

    //Metodo Listar na tabela
    public void listar() {
        
        ClienteDAO dao = new ClienteDAO();
        
        List<Cliente> lista = dao.listarClientes();
        DefaultTableModel dados = (DefaultTableModel) jTblClientes.getModel();
        dados.setNumRows(0);
        
        for (Cliente c : lista) {
            dados.addRow(new Object[]{
                c.getNome(),
                c.getDocumento(),
                c.getTipoCliente(),
                c.getEmail(),
                c.getLogradouro(),
                c.getNumero(),
                c.getComplemento(),
                c.getBairro(),
                c.getCidade(),
                c.getEstado(),
                c.getCep(),
                c.getObservacoes(),});
            
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPnCadrastro = new javax.swing.JPanel();
        jTxtCep = new javax.swing.JFormattedTextField();
        jRdBtnJuridica = new javax.swing.JRadioButton();
        jRdBtnFisica = new javax.swing.JRadioButton();
        jCbxUF = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxtObs = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTxtNome = new javax.swing.JTextField();
        jTxtDocumento = new javax.swing.JTextField();
        jTxtEmail = new javax.swing.JTextField();
        jTxtEndereco = new javax.swing.JTextField();
        jTxtNumero = new javax.swing.JTextField();
        jTxtComplemento = new javax.swing.JTextField();
        jTxtBairro = new javax.swing.JTextField();
        jTxtCidade = new javax.swing.JTextField();
        jTxtTelefone = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTblClientes = new javax.swing.JTable();
        jBtnAdicionar = new javax.swing.JButton();
        jBtnEditar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jPnConsulta = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jTxtConsultaDocumento = new javax.swing.JTextField();
        jTxtConsultaNome = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTxtConsultaEmail = new javax.swing.JTextField();
        jTxtTelefoneTelefone = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTblClienteS = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Clientes");
        setPreferredSize(new java.awt.Dimension(668, 541));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        try {
            jTxtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTxtCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCepActionPerformed(evt);
            }
        });
        jTxtCep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtCepKeyPressed(evt);
            }
        });

        jRdBtnJuridica.setText("Pessoa Jurídica");
        jRdBtnJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRdBtnJuridicaActionPerformed(evt);
            }
        });

        jRdBtnFisica.setText("Pessoa Física");

        jCbxUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RR", "SC", "SE", "SP", "TO" }));

        jTxtObs.setColumns(20);
        jTxtObs.setRows(5);
        jScrollPane1.setViewportView(jTxtObs);

        jLabel3.setText("OBSERVAÇÃO");

        jLabel10.setText("Cidade");

        jTxtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNomeActionPerformed(evt);
            }
        });

        jTxtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNumeroActionPerformed(evt);
            }
        });

        jTxtBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtBairroActionPerformed(evt);
            }
        });

        try {
            jTxtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) 9 ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTxtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtTelefoneActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome");

        jLabel2.setText("Documento");

        jLabel4.setText("Telefone");

        jLabel5.setText("e-mail");

        jLabel6.setText("Endereço");

        jLabel7.setText("Nº");

        jLabel8.setText("Complemento");

        jLabel9.setText("Bairro");

        jLabel11.setText("Cep");

        jLabel13.setText("UF");

        jTblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nome", "Documento", "Tipo Cliente", "E-mail", "Data Cadastro"
            }
        ));
        jTblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTblClientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTblClientes);

        jBtnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/create.png"))); // NOI18N
        jBtnAdicionar.setToolTipText("Adiconar Usuário");
        jBtnAdicionar.setMaximumSize(new java.awt.Dimension(80, 80));
        jBtnAdicionar.setMinimumSize(new java.awt.Dimension(80, 80));
        jBtnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAdicionarActionPerformed(evt);
            }
        });

        jBtnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/update.png"))); // NOI18N
        jBtnEditar.setToolTipText("Editar Usuário");
        jBtnEditar.setEnabled(false);
        jBtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEditarActionPerformed(evt);
            }
        });

        jBtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        jBtnExcluir.setToolTipText("Excluir Usuário");
        jBtnExcluir.setEnabled(false);
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPnCadrastroLayout = new javax.swing.GroupLayout(jPnCadrastro);
        jPnCadrastro.setLayout(jPnCadrastroLayout);
        jPnCadrastroLayout.setHorizontalGroup(
            jPnCadrastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnCadrastroLayout.createSequentialGroup()
                .addGroup(jPnCadrastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnCadrastroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPnCadrastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPnCadrastroLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTxtNome))
                            .addGroup(jPnCadrastroLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTxtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRdBtnJuridica)
                                .addGap(18, 18, 18)
                                .addComponent(jRdBtnFisica))
                            .addComponent(jLabel9)
                            .addGroup(jPnCadrastroLayout.createSequentialGroup()
                                .addGroup(jPnCadrastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPnCadrastroLayout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTxtCep))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPnCadrastroLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPnCadrastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPnCadrastroLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPnCadrastroLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTxtEndereco))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnCadrastroLayout.createSequentialGroup()
                                .addGroup(jPnCadrastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPnCadrastroLayout.createSequentialGroup()
                                        .addGroup(jPnCadrastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPnCadrastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jTxtComplemento)
                                            .addComponent(jScrollPane1)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPnCadrastroLayout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24)
                                        .addComponent(jLabel13)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCbxUF, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTxtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPnCadrastroLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jTxtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(9, 9, 9))))
                    .addGroup(jPnCadrastroLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jBtnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(jBtnEditar)
                        .addGap(75, 75, 75)
                        .addComponent(jBtnExcluir)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPnCadrastroLayout.setVerticalGroup(
            jPnCadrastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnCadrastroLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPnCadrastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPnCadrastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTxtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRdBtnJuridica)
                    .addComponent(jRdBtnFisica))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPnCadrastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnCadrastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTxtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTxtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPnCadrastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jTxtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jCbxUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPnCadrastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTxtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPnCadrastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(27, 27, 27)
                .addGroup(jPnCadrastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnCadrastroLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 9, Short.MAX_VALUE)
                        .addGap(77, 77, 77))
                    .addGroup(jPnCadrastroLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPnCadrastroLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPnCadrastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnEditar)
                    .addComponent(jBtnExcluir))
                .addGap(77, 77, 77))
        );

        jTabbedPane1.addTab("Cadastro", jPnCadrastro);

        jLabel19.setText("Documento");

        jTxtConsultaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtConsultaNomeActionPerformed(evt);
            }
        });
        jTxtConsultaNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtConsultaNomeKeyPressed(evt);
            }
        });

        jLabel20.setText("Nome");

        try {
            jTxtTelefoneTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) 9 ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTxtTelefoneTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtTelefoneTelefoneActionPerformed(evt);
            }
        });

        jLabel15.setText("Telefone");

        jLabel16.setText("E-mail");

        jTblClienteS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Documento", "Tipo Cliente", "E-mail", "Telefone", "Logradouro", "Número", "Complemento", "Bairro", "Cidade", "Estado", "Cep", "Observações"
            }
        ));
        jTblClienteS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTblClienteSMouseClicked(evt);
            }
        });
        jTblClienteS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTblClienteSKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(jTblClienteS);

        javax.swing.GroupLayout jPnConsultaLayout = new javax.swing.GroupLayout(jPnConsulta);
        jPnConsulta.setLayout(jPnConsultaLayout);
        jPnConsultaLayout.setHorizontalGroup(
            jPnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPnConsultaLayout.createSequentialGroup()
                            .addComponent(jLabel19)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTxtConsultaDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                            .addGap(3, 3, 3))
                        .addGroup(jPnConsultaLayout.createSequentialGroup()
                            .addComponent(jLabel20)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTxtConsultaNome)))
                    .addGroup(jPnConsultaLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(25, 25, 25)
                        .addComponent(jTxtTelefoneTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTxtConsultaEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(jPnConsultaLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPnConsultaLayout.setVerticalGroup(
            jPnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnConsultaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jTxtConsultaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jTxtConsultaDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnConsultaLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTxtTelefoneTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16)
                        .addComponent(jTxtConsultaEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consulta", jPnConsulta);

        jMenu1.setText("Arquivo");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sair");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        listar();
    }//GEN-LAST:event_formWindowOpened

    private void jTxtCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCepActionPerformed

    private void jTxtCepKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtCepKeyPressed
        //Programacao do keypress
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Cliente obj = new Cliente();
            ClienteDAO dao = new ClienteDAO();
            obj = dao.buscaCep(jTxtCep.getText());

            jTxtEndereco.setText(obj.getLogradouro());
            jTxtBairro.setText(obj.getBairro());
            jTxtCidade.setText(obj.getCidade());
            jCbxUF.setSelectedItem(obj.getEstado());
            // System.out.println(obj.getEstado());
            jTxtNumero.requestFocus();
        }
    }//GEN-LAST:event_jTxtCepKeyPressed

    private void jRdBtnJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRdBtnJuridicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRdBtnJuridicaActionPerformed

    private void jTxtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNomeActionPerformed

    private void jTxtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNumeroActionPerformed

    private void jTxtBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtBairroActionPerformed

    private void jTxtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtTelefoneActionPerformed

    private void jBtnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAdicionarActionPerformed
        if ((jTxtNome.getText().isEmpty()) || (jTxtDocumento.getText().isEmpty())) {
            JOptionPane.showMessageDialog(null, "Nome ou documento vazio!!!\nPreencha os campos");
        } else {

            String nome = jTxtNome.getText();
            String documento = jTxtDocumento.getText();
            String tipo;
            if (jRdBtnFisica.isSelected()) {
                tipo = jRdBtnFisica.getText();
            } else {
                tipo = jRdBtnJuridica.getText();
            }
            String telefone = jTxtTelefone.getText().replaceAll("[^0-9]", "");
            String email = jTxtEmail.getText();
            String endereco = jTxtEndereco.getText();
            String numero = jTxtNumero.getText();
            String complemento = jTxtComplemento.getText();
            String bairro = jTxtBairro.getText();
            String cidade = jTxtCidade.getText();
            String uf = jCbxUF.getSelectedItem().toString();
            String cep = jTxtCep.getText().replaceAll("[^0-9]", "");
            String obs = jTxtObs.getText();

            Cliente usuario = new Cliente(nome, documento, tipo, telefone, email, endereco, numero, complemento, bairro, cidade, uf, cep, obs);
            System.out.println(usuario.getEstado());
            System.out.println(usuario.getCep());
            ClienteDAO dao = new ClienteDAO();
            dao.adicionarUsuario(usuario);
            jTxtNome.setText("");
            jTxtEmail.setText(null);
            jTxtDocumento.setText(null);
            jTxtTelefone.setText(null);
            buttonGroup1.isSelected(null);
            jTxtCep.setText(null);
            jTxtEndereco.setText(null);
            jTxtNumero.setText(null);
            jTxtCidade.setText(null);
            jCbxUF.setSelectedItem(null);
            jTxtBairro.setText(null);
            jTxtComplemento.setText(null);
            jTxtObs.setText(null);
            jBtnAdicionar.setEnabled(true);
            jBtnEditar.setEnabled(false);
            jBtnExcluir.setEnabled(false);
        }
        listar();
    }//GEN-LAST:event_jBtnAdicionarActionPerformed

    private void jBtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEditarActionPerformed
        //        if ((jTxtNomeCliente.getText().isEmpty()) || (jTxtSenha.getText().isEmpty())
            //            || (jTxtNomeCompleto.getText().isBlank()) || (jCbxPerfil.getSelectedItem().equals(" ")) || (jTxtEmail.getText().isEmpty())) {
            //            JOptionPane.showMessageDialog(null, "Preencha todos os campos!!!");
            //        } else {
            //
            //            String nome = jTxtNomeCliente.getText();
            //            String senha = jTxtSenha.getText();
            //            String perfil = jCbxPerfil.getSelectedItem().toString();
            //            String nomeCompleto = jTxtNomeCompleto.getText();
            //            String email = jTxtEmail.getText();
            //            int id = (int) jTblCliente.getValueAt(jTblCliente.getSelectedRow(), 0);
            //            Cliente usuario = new Cliente(id, nome, senha, perfil, nomeCompleto, email);
            //
            //            ClienteDAO dao = new ClienteDAO();
            //            dao.alterarCliente(usuario);
            //            jTxtNomeCliente.setText("");
            //            jTxtEmail.setText(null);
            //            jTxtNomeCompleto.setText(null);
            //            jTxtSenha.setText(null);
            //            jCbxPerfil.setSelectedItem("Usuário");
            //            jBtnAdicionar.setEnabled(true);
            //            jBtnEditar.setEnabled(false);
            //            jBtnExcluir.setEnabled(false);
            //        }
    }//GEN-LAST:event_jBtnEditarActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        //        if ((jTxtNomeCliente.getText().isEmpty()) || (jTxtSenha.getText().isEmpty())
            //            || (jTxtNomeCompleto.getText().isBlank()) || (jCbxPerfil.getSelectedItem().equals(" ")) || (jTxtEmail.getText().isEmpty())) {
            //            JOptionPane.showMessageDialog(null, "Preencha todos os campos!!!");
            //        } else {
            //
            //            ClienteDAO dao = new ClienteDAO();
            //            int resp = JOptionPane.showConfirmDialog(null, "Confirma exclusão do Usuário\n" + jTblCliente.getValueAt(jTblCliente.getSelectedRow(), 1));
            //
            //            if (resp == 0) {
                //                dao.excluirCliente((int) jTblCliente.getValueAt(jTblCliente.getSelectedRow(), 0));
                //            }
            //            jTxtNomeCliente.setText("");
            //            jTxtEmail.setText(null);
            //            jTxtNomeCompleto.setText(null);
            //            jTxtSenha.setText(null);
            //            jCbxPerfil.setSelectedItem("Usuário");
            //            jBtnAdicionar.setEnabled(true);
            //            jBtnEditar.setEnabled(false);
            //            jBtnExcluir.setEnabled(false);
            //        }
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jTblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTblClientesMouseClicked
        jTxtNome.setText(jTblClientes.getValueAt(jTblClientes.getSelectedRow(), 0).toString());
        jTxtDocumento.setText(jTblClientes.getValueAt(jTblClientes.getSelectedRow(), 1).toString());
        jTxtEmail.setText(jTblClientes.getValueAt(jTblClientes.getSelectedRow(), 3).toString());
        String tipo = jTblClientes.getValueAt(jTblClientes.getSelectedRow(), 2).toString();
        if (tipo == "Pessoa Fisica"){
            jRdBtnFisica.setSelected(false);
            jRdBtnJuridica.setSelected(true);
        }else if (tipo == "Pessoa Juridica") {
            jRdBtnJuridica.setSelected(true);
            jRdBtnFisica.setSelected(false);
        }
    }//GEN-LAST:event_jTblClientesMouseClicked

    private void jTxtConsultaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtConsultaNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtConsultaNomeActionPerformed

    private void jTxtTelefoneTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtTelefoneTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtTelefoneTelefoneActionPerformed

    private void jTblClienteSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTblClienteSMouseClicked
        
        jTxtNome.setText(jTblClientes.getValueAt(jTblClientes.getSelectedRow(), 0).toString());
        jTxtDocumento.setText(jTblClientes.getValueAt(jTblClientes.getSelectedRow(), 1).toString());
        jTxtEmail.setText(jTblClientes.getValueAt(jTblClientes.getSelectedRow(), 3).toString());
        String tipo = jTblClientes.getValueAt(jTblClientes.getSelectedRow(), 2).toString();
        if (tipo == "Pessoa Fisica"){
            jRdBtnFisica.setSelected(false);
            jRdBtnJuridica.setSelected(true);
        }else if (tipo == "Pessoa Juridica") {
            jRdBtnJuridica.setSelected(true);
            jRdBtnFisica.setSelected(false);
        }
    }//GEN-LAST:event_jTblClienteSMouseClicked

    private void jTxtConsultaNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtConsultaNomeKeyPressed
       String nome = "?"+ jTxtNome.getText()+"%";
       ClienteDAO dao = new ClienteDAO();
       List<Cliente> lista = dao.listarClienteNome(nome);
       
        DefaultTableModel dados = ( DefaultTableModel) jTblClientes.getModel();
        
        dados.setColumnCount(0);
        
        for (Cliente c : lista) {
            dados.addRow(new Object[]{
                c.getNome(),
                c.getDocumento(),
                c.getTipoCliente(),
                c.getEmail(),
                c.getLogradouro(),
                c.getNumero(),
                c.getComplemento(),
                c.getBairro(),
                c.getCidade(),
                c.getEstado(),
                c.getCep(),
                c.getObservacoes(),});
        }
        
    }//GEN-LAST:event_jTxtConsultaNomeKeyPressed

    private void jTblClienteSKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTblClienteSKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTblClienteSKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCliente1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCliente1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCliente1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCliente1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCliente1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBtnAdicionar;
    private javax.swing.JButton jBtnEditar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JComboBox<String> jCbxUF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPnCadrastro;
    private javax.swing.JPanel jPnConsulta;
    private javax.swing.JRadioButton jRdBtnFisica;
    private javax.swing.JRadioButton jRdBtnJuridica;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTblClienteS;
    private javax.swing.JTable jTblClientes;
    private javax.swing.JTextField jTxtBairro;
    private javax.swing.JFormattedTextField jTxtCep;
    private javax.swing.JTextField jTxtCidade;
    private javax.swing.JTextField jTxtComplemento;
    private javax.swing.JTextField jTxtConsultaDocumento;
    private javax.swing.JTextField jTxtConsultaEmail;
    private javax.swing.JTextField jTxtConsultaNome;
    private javax.swing.JTextField jTxtDocumento;
    private javax.swing.JTextField jTxtEmail;
    private javax.swing.JTextField jTxtEndereco;
    private javax.swing.JTextField jTxtNome;
    private javax.swing.JTextField jTxtNumero;
    private javax.swing.JTextArea jTxtObs;
    private javax.swing.JFormattedTextField jTxtTelefone;
    private javax.swing.JFormattedTextField jTxtTelefoneTelefone;
    // End of variables declaration//GEN-END:variables
}