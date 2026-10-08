//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeGraniteSecurityUserUserPropertiesServiceProperties {
  /// Returns a new [ComAdobeGraniteSecurityUserUserPropertiesServiceProperties] instance.
  ComAdobeGraniteSecurityUserUserPropertiesServiceProperties({
    this.adapterPeriodCondition,
    this.granitePeriodUserpropertiesPeriodNodetypes,
    this.granitePeriodUserpropertiesPeriodResourcetypes,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? adapterPeriodCondition;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? granitePeriodUserpropertiesPeriodNodetypes;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? granitePeriodUserpropertiesPeriodResourcetypes;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeGraniteSecurityUserUserPropertiesServiceProperties &&
    other.adapterPeriodCondition == adapterPeriodCondition &&
    other.granitePeriodUserpropertiesPeriodNodetypes == granitePeriodUserpropertiesPeriodNodetypes &&
    other.granitePeriodUserpropertiesPeriodResourcetypes == granitePeriodUserpropertiesPeriodResourcetypes;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (adapterPeriodCondition == null ? 0 : adapterPeriodCondition!.hashCode) +
    (granitePeriodUserpropertiesPeriodNodetypes == null ? 0 : granitePeriodUserpropertiesPeriodNodetypes!.hashCode) +
    (granitePeriodUserpropertiesPeriodResourcetypes == null ? 0 : granitePeriodUserpropertiesPeriodResourcetypes!.hashCode);

  @override
  String toString() => 'ComAdobeGraniteSecurityUserUserPropertiesServiceProperties[adapterPeriodCondition=$adapterPeriodCondition, granitePeriodUserpropertiesPeriodNodetypes=$granitePeriodUserpropertiesPeriodNodetypes, granitePeriodUserpropertiesPeriodResourcetypes=$granitePeriodUserpropertiesPeriodResourcetypes]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.adapterPeriodCondition != null) {
      json[r'adapter.condition'] = this.adapterPeriodCondition;
    } else {
      json[r'adapter.condition'] = null;
    }
    if (this.granitePeriodUserpropertiesPeriodNodetypes != null) {
      json[r'granite.userproperties.nodetypes'] = this.granitePeriodUserpropertiesPeriodNodetypes;
    } else {
      json[r'granite.userproperties.nodetypes'] = null;
    }
    if (this.granitePeriodUserpropertiesPeriodResourcetypes != null) {
      json[r'granite.userproperties.resourcetypes'] = this.granitePeriodUserpropertiesPeriodResourcetypes;
    } else {
      json[r'granite.userproperties.resourcetypes'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeGraniteSecurityUserUserPropertiesServiceProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeGraniteSecurityUserUserPropertiesServiceProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeGraniteSecurityUserUserPropertiesServiceProperties(
        adapterPeriodCondition: ConfigNodePropertyString.fromJson(json[r'adapter.condition']),
        granitePeriodUserpropertiesPeriodNodetypes: ConfigNodePropertyArray.fromJson(json[r'granite.userproperties.nodetypes']),
        granitePeriodUserpropertiesPeriodResourcetypes: ConfigNodePropertyArray.fromJson(json[r'granite.userproperties.resourcetypes']),
      );
    }
    return null;
  }

  static List<ComAdobeGraniteSecurityUserUserPropertiesServiceProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeGraniteSecurityUserUserPropertiesServiceProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeGraniteSecurityUserUserPropertiesServiceProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeGraniteSecurityUserUserPropertiesServiceProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeGraniteSecurityUserUserPropertiesServiceProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeGraniteSecurityUserUserPropertiesServiceProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeGraniteSecurityUserUserPropertiesServiceProperties-objects as value to a dart map
  static Map<String, List<ComAdobeGraniteSecurityUserUserPropertiesServiceProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeGraniteSecurityUserUserPropertiesServiceProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeGraniteSecurityUserUserPropertiesServiceProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

