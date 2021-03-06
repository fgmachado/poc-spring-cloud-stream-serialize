/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package io.confluent.connect.avro;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class ClienteAvroDto extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 9155049516949641253L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ClienteAvroDto\",\"namespace\":\"io.confluent.connect.avro\",\"fields\":[{\"name\":\"id\",\"type\":\"int\"},{\"name\":\"nome\",\"type\":\"string\"},{\"name\":\"cpf\",\"type\":\"string\"},{\"name\":\"data_cadastro\",\"type\":[\"null\",{\"type\":\"long\",\"connect.version\":1,\"connect.name\":\"org.apache.kafka.connect.data.Timestamp\",\"logicalType\":\"timestamp-millis\"}],\"default\":null}],\"connect.name\":\"io.confluent.connect.avro.ClienteAvroDto\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<ClienteAvroDto> ENCODER =
      new BinaryMessageEncoder<ClienteAvroDto>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<ClienteAvroDto> DECODER =
      new BinaryMessageDecoder<ClienteAvroDto>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<ClienteAvroDto> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<ClienteAvroDto> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<ClienteAvroDto>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this ClienteAvroDto to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a ClienteAvroDto from a ByteBuffer. */
  public static ClienteAvroDto fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public int id;
  @Deprecated public java.lang.CharSequence nome;
  @Deprecated public java.lang.CharSequence cpf;
  @Deprecated public org.joda.time.DateTime data_cadastro;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ClienteAvroDto() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param nome The new value for nome
   * @param cpf The new value for cpf
   * @param data_cadastro The new value for data_cadastro
   */
  public ClienteAvroDto(java.lang.Integer id, java.lang.CharSequence nome, java.lang.CharSequence cpf, org.joda.time.DateTime data_cadastro) {
    this.id = id;
    this.nome = nome;
    this.cpf = cpf;
    this.data_cadastro = data_cadastro;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return nome;
    case 2: return cpf;
    case 3: return data_cadastro;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.Integer)value$; break;
    case 1: nome = (java.lang.CharSequence)value$; break;
    case 2: cpf = (java.lang.CharSequence)value$; break;
    case 3: data_cadastro = (org.joda.time.DateTime)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.Integer getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.Integer value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'nome' field.
   * @return The value of the 'nome' field.
   */
  public java.lang.CharSequence getNome() {
    return nome;
  }

  /**
   * Sets the value of the 'nome' field.
   * @param value the value to set.
   */
  public void setNome(java.lang.CharSequence value) {
    this.nome = value;
  }

  /**
   * Gets the value of the 'cpf' field.
   * @return The value of the 'cpf' field.
   */
  public java.lang.CharSequence getCpf() {
    return cpf;
  }

  /**
   * Sets the value of the 'cpf' field.
   * @param value the value to set.
   */
  public void setCpf(java.lang.CharSequence value) {
    this.cpf = value;
  }

  /**
   * Gets the value of the 'data_cadastro' field.
   * @return The value of the 'data_cadastro' field.
   */
  public org.joda.time.DateTime getDataCadastro() {
    return data_cadastro;
  }

  /**
   * Sets the value of the 'data_cadastro' field.
   * @param value the value to set.
   */
  public void setDataCadastro(org.joda.time.DateTime value) {
    this.data_cadastro = value;
  }

  /**
   * Creates a new ClienteAvroDto RecordBuilder.
   * @return A new ClienteAvroDto RecordBuilder
   */
  public static io.confluent.connect.avro.ClienteAvroDto.Builder newBuilder() {
    return new io.confluent.connect.avro.ClienteAvroDto.Builder();
  }

  /**
   * Creates a new ClienteAvroDto RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ClienteAvroDto RecordBuilder
   */
  public static io.confluent.connect.avro.ClienteAvroDto.Builder newBuilder(io.confluent.connect.avro.ClienteAvroDto.Builder other) {
    return new io.confluent.connect.avro.ClienteAvroDto.Builder(other);
  }

  /**
   * Creates a new ClienteAvroDto RecordBuilder by copying an existing ClienteAvroDto instance.
   * @param other The existing instance to copy.
   * @return A new ClienteAvroDto RecordBuilder
   */
  public static io.confluent.connect.avro.ClienteAvroDto.Builder newBuilder(io.confluent.connect.avro.ClienteAvroDto other) {
    return new io.confluent.connect.avro.ClienteAvroDto.Builder(other);
  }

  /**
   * RecordBuilder for ClienteAvroDto instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ClienteAvroDto>
    implements org.apache.avro.data.RecordBuilder<ClienteAvroDto> {

    private int id;
    private java.lang.CharSequence nome;
    private java.lang.CharSequence cpf;
    private org.joda.time.DateTime data_cadastro;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(io.confluent.connect.avro.ClienteAvroDto.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.nome)) {
        this.nome = data().deepCopy(fields()[1].schema(), other.nome);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.cpf)) {
        this.cpf = data().deepCopy(fields()[2].schema(), other.cpf);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.data_cadastro)) {
        this.data_cadastro = data().deepCopy(fields()[3].schema(), other.data_cadastro);
        fieldSetFlags()[3] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing ClienteAvroDto instance
     * @param other The existing instance to copy.
     */
    private Builder(io.confluent.connect.avro.ClienteAvroDto other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.nome)) {
        this.nome = data().deepCopy(fields()[1].schema(), other.nome);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.cpf)) {
        this.cpf = data().deepCopy(fields()[2].schema(), other.cpf);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.data_cadastro)) {
        this.data_cadastro = data().deepCopy(fields()[3].schema(), other.data_cadastro);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.Integer getId() {
      return id;
    }

    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public io.confluent.connect.avro.ClienteAvroDto.Builder setId(int value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public io.confluent.connect.avro.ClienteAvroDto.Builder clearId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'nome' field.
      * @return The value.
      */
    public java.lang.CharSequence getNome() {
      return nome;
    }

    /**
      * Sets the value of the 'nome' field.
      * @param value The value of 'nome'.
      * @return This builder.
      */
    public io.confluent.connect.avro.ClienteAvroDto.Builder setNome(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.nome = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'nome' field has been set.
      * @return True if the 'nome' field has been set, false otherwise.
      */
    public boolean hasNome() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'nome' field.
      * @return This builder.
      */
    public io.confluent.connect.avro.ClienteAvroDto.Builder clearNome() {
      nome = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'cpf' field.
      * @return The value.
      */
    public java.lang.CharSequence getCpf() {
      return cpf;
    }

    /**
      * Sets the value of the 'cpf' field.
      * @param value The value of 'cpf'.
      * @return This builder.
      */
    public io.confluent.connect.avro.ClienteAvroDto.Builder setCpf(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.cpf = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'cpf' field has been set.
      * @return True if the 'cpf' field has been set, false otherwise.
      */
    public boolean hasCpf() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'cpf' field.
      * @return This builder.
      */
    public io.confluent.connect.avro.ClienteAvroDto.Builder clearCpf() {
      cpf = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'data_cadastro' field.
      * @return The value.
      */
    public org.joda.time.DateTime getDataCadastro() {
      return data_cadastro;
    }

    /**
      * Sets the value of the 'data_cadastro' field.
      * @param value The value of 'data_cadastro'.
      * @return This builder.
      */
    public io.confluent.connect.avro.ClienteAvroDto.Builder setDataCadastro(org.joda.time.DateTime value) {
      validate(fields()[3], value);
      this.data_cadastro = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'data_cadastro' field has been set.
      * @return True if the 'data_cadastro' field has been set, false otherwise.
      */
    public boolean hasDataCadastro() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'data_cadastro' field.
      * @return This builder.
      */
    public io.confluent.connect.avro.ClienteAvroDto.Builder clearDataCadastro() {
      data_cadastro = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ClienteAvroDto build() {
      try {
        ClienteAvroDto record = new ClienteAvroDto();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.Integer) defaultValue(fields()[0]);
        record.nome = fieldSetFlags()[1] ? this.nome : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.cpf = fieldSetFlags()[2] ? this.cpf : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.data_cadastro = fieldSetFlags()[3] ? this.data_cadastro : (org.joda.time.DateTime) defaultValue(fields()[3]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<ClienteAvroDto>
    WRITER$ = (org.apache.avro.io.DatumWriter<ClienteAvroDto>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<ClienteAvroDto>
    READER$ = (org.apache.avro.io.DatumReader<ClienteAvroDto>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
