artifactory() {
 propertySets {
  propertySet('property_set_name') {
    singleSelect('property_name') {
      defaultValue "value_1"
      value "value_2"
      value "value_3"
    }
    multiSelect('property_name_multi') {
      defaultValue "value_1"
      defaultValue "value_2"
      value "value_3"
      value "value_4"
    }
    anyValue('another_property_name') {
      defaultValue "value_1"
      value "value_2"
    }
  }
} 
}