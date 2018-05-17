package com.thaumaturzy.b2b;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class ImmigrationDetails implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(generator = "IMMIGRATIONDETAILS_ID_GENERATOR", strategy = javax.persistence.GenerationType.AUTO)
   @javax.persistence.Id
   @javax.persistence.SequenceGenerator(name = "IMMIGRATIONDETAILS_ID_GENERATOR", sequenceName = "IMMIGRATIONDETAILS_ID_SEQ")
   private java.lang.Long id;

   @org.kie.api.definition.type.Label("When Did you enter US")
   private java.util.Date when_Did_you_Enter_US;

   @org.kie.api.definition.type.Label("When Did you Exit Country")
   private java.lang.String when_Did_You_Exit_USA;

   @javax.persistence.ElementCollection(fetch = javax.persistence.FetchType.EAGER)
   @org.kie.api.definition.type.Label("Visa Type")
   private java.util.List<java.lang.String> visa_Type;

   @org.kie.api.definition.type.Label("I-797    Number")
   private java.lang.String i_797_Number;

   @org.kie.api.definition.type.Label("I_797_Valid_From")
   private java.util.Date i_797_Valid_From;

   @org.kie.api.definition.type.Label("I-797 Valid Till")
   private java.util.Date i_797_Valid_to;

   @org.kie.api.definition.type.Label("Visa Number")
   private java.lang.String visa_Number;

   public ImmigrationDetails()
   {
   }

   public java.lang.Long getId()
   {
      return this.id;
   }

   public void setId(java.lang.Long id)
   {
      this.id = id;
   }

   public java.util.Date getWhen_Did_you_Enter_US()
   {
      return this.when_Did_you_Enter_US;
   }

   public void setWhen_Did_you_Enter_US(java.util.Date when_Did_you_Enter_US)
   {
      this.when_Did_you_Enter_US = when_Did_you_Enter_US;
   }

   public java.lang.String getWhen_Did_You_Exit_USA()
   {
      return this.when_Did_You_Exit_USA;
   }

   public void setWhen_Did_You_Exit_USA(java.lang.String when_Did_You_Exit_USA)
   {
      this.when_Did_You_Exit_USA = when_Did_You_Exit_USA;
   }

   public java.util.List<java.lang.String> getVisa_Type()
   {
      return this.visa_Type;
   }

   public void setVisa_Type(java.util.List<java.lang.String> visa_Type)
   {
      this.visa_Type = visa_Type;
   }

   public java.lang.String getI_797_Number()
   {
      return this.i_797_Number;
   }

   public void setI_797_Number(java.lang.String i_797_Number)
   {
      this.i_797_Number = i_797_Number;
   }

   public java.util.Date getI_797_Valid_From()
   {
      return this.i_797_Valid_From;
   }

   public void setI_797_Valid_From(java.util.Date i_797_Valid_From)
   {
      this.i_797_Valid_From = i_797_Valid_From;
   }

   public java.util.Date getI_797_Valid_to()
   {
      return this.i_797_Valid_to;
   }

   public void setI_797_Valid_to(java.util.Date i_797_Valid_to)
   {
      this.i_797_Valid_to = i_797_Valid_to;
   }

   public java.lang.String getVisa_Number()
   {
      return this.visa_Number;
   }

   public void setVisa_Number(java.lang.String visa_Number)
   {
      this.visa_Number = visa_Number;
   }

   public ImmigrationDetails(java.lang.Long id,
         java.util.Date when_Did_you_Enter_US,
         java.lang.String when_Did_You_Exit_USA,
         java.util.List<java.lang.String> visa_Type,
         java.lang.String i_797_Number, java.util.Date i_797_Valid_From,
         java.util.Date i_797_Valid_to, java.lang.String visa_Number)
   {
      this.id = id;
      this.when_Did_you_Enter_US = when_Did_you_Enter_US;
      this.when_Did_You_Exit_USA = when_Did_You_Exit_USA;
      this.visa_Type = visa_Type;
      this.i_797_Number = i_797_Number;
      this.i_797_Valid_From = i_797_Valid_From;
      this.i_797_Valid_to = i_797_Valid_to;
      this.visa_Number = visa_Number;
   }

}