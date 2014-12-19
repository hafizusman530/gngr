/**
 * This class is generated by jOOQ
 */
package info.gngr.db.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.5.0"
    },
    comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GlobalsRecord extends org.jooq.impl.UpdatableRecordImpl<info.gngr.db.tables.records.GlobalsRecord> implements
    org.jooq.Record3<java.lang.String, java.lang.Integer, java.lang.Boolean> {

  private static final long serialVersionUID = 1572132991;

  /**
   * Setter for <code>PUBLIC.GLOBALS.NOTACOLUMN</code>.
   */
  public void setNotacolumn(final java.lang.String value) {
    setValue(0, value);
  }

  /**
   * Getter for <code>PUBLIC.GLOBALS.NOTACOLUMN</code>.
   */
  public java.lang.String getNotacolumn() {
    return (java.lang.String) getValue(0);
  }

  /**
   * Setter for <code>PUBLIC.GLOBALS.SCHEMAVERSION</code>.
   */
  public void setSchemaversion(final java.lang.Integer value) {
    setValue(1, value);
  }

  /**
   * Getter for <code>PUBLIC.GLOBALS.SCHEMAVERSION</code>.
   */
  public java.lang.Integer getSchemaversion() {
    return (java.lang.Integer) getValue(1);
  }

  /**
   * Setter for <code>PUBLIC.GLOBALS.PERMISSIONSINITIALIZED</code>.
   */
  public void setPermissionsinitialized(final java.lang.Boolean value) {
    setValue(2, value);
  }

  /**
   * Getter for <code>PUBLIC.GLOBALS.PERMISSIONSINITIALIZED</code>.
   */
  public java.lang.Boolean getPermissionsinitialized() {
    return (java.lang.Boolean) getValue(2);
  }

  // -------------------------------------------------------------------------
  // Primary key information
  // -------------------------------------------------------------------------

  /**
   * {@inheritDoc}
   */
  @Override
  public org.jooq.Record1<java.lang.String> key() {
    return (org.jooq.Record1) super.key();
  }

  // -------------------------------------------------------------------------
  // Record3 type implementation
  // -------------------------------------------------------------------------

  /**
   * {@inheritDoc}
   */
  @Override
  public org.jooq.Row3<java.lang.String, java.lang.Integer, java.lang.Boolean> fieldsRow() {
    return (org.jooq.Row3) super.fieldsRow();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public org.jooq.Row3<java.lang.String, java.lang.Integer, java.lang.Boolean> valuesRow() {
    return (org.jooq.Row3) super.valuesRow();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public org.jooq.Field<java.lang.String> field1() {
    return info.gngr.db.tables.Globals.GLOBALS.NOTACOLUMN;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public org.jooq.Field<java.lang.Integer> field2() {
    return info.gngr.db.tables.Globals.GLOBALS.SCHEMAVERSION;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public org.jooq.Field<java.lang.Boolean> field3() {
    return info.gngr.db.tables.Globals.GLOBALS.PERMISSIONSINITIALIZED;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public java.lang.String value1() {
    return getNotacolumn();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public java.lang.Integer value2() {
    return getSchemaversion();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public java.lang.Boolean value3() {
    return getPermissionsinitialized();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public GlobalsRecord value1(final java.lang.String value) {
    setNotacolumn(value);
    return this;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public GlobalsRecord value2(final java.lang.Integer value) {
    setSchemaversion(value);
    return this;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public GlobalsRecord value3(final java.lang.Boolean value) {
    setPermissionsinitialized(value);
    return this;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public GlobalsRecord values(final java.lang.String value1, final java.lang.Integer value2, final java.lang.Boolean value3) {
    return this;
  }

  // -------------------------------------------------------------------------
  // Constructors
  // -------------------------------------------------------------------------

  /**
   * Create a detached GlobalsRecord
   */
  public GlobalsRecord() {
    super(info.gngr.db.tables.Globals.GLOBALS);
  }

  /**
   * Create a detached, initialised GlobalsRecord
   */
  public GlobalsRecord(final java.lang.String notacolumn, final java.lang.Integer schemaversion,
      final java.lang.Boolean permissionsinitialized) {
    super(info.gngr.db.tables.Globals.GLOBALS);

    setValue(0, notacolumn);
    setValue(1, schemaversion);
    setValue(2, permissionsinitialized);
  }
}