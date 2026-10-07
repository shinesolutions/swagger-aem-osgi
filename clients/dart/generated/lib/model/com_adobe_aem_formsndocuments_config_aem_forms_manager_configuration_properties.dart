//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties {
  /// Returns a new [ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties] instance.
  ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties({
    this.formsManagerConfigPeriodIncludeOOTBTemplates,
    this.formsManagerConfigPeriodIncludeDeprecatedTemplates,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? formsManagerConfigPeriodIncludeOOTBTemplates;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? formsManagerConfigPeriodIncludeDeprecatedTemplates;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties &&
    other.formsManagerConfigPeriodIncludeOOTBTemplates == formsManagerConfigPeriodIncludeOOTBTemplates &&
    other.formsManagerConfigPeriodIncludeDeprecatedTemplates == formsManagerConfigPeriodIncludeDeprecatedTemplates;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (formsManagerConfigPeriodIncludeOOTBTemplates == null ? 0 : formsManagerConfigPeriodIncludeOOTBTemplates!.hashCode) +
    (formsManagerConfigPeriodIncludeDeprecatedTemplates == null ? 0 : formsManagerConfigPeriodIncludeDeprecatedTemplates!.hashCode);

  @override
  String toString() => 'ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties[formsManagerConfigPeriodIncludeOOTBTemplates=$formsManagerConfigPeriodIncludeOOTBTemplates, formsManagerConfigPeriodIncludeDeprecatedTemplates=$formsManagerConfigPeriodIncludeDeprecatedTemplates]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.formsManagerConfigPeriodIncludeOOTBTemplates != null) {
      json[r'formsManagerConfig.includeOOTBTemplates'] = this.formsManagerConfigPeriodIncludeOOTBTemplates;
    } else {
      json[r'formsManagerConfig.includeOOTBTemplates'] = null;
    }
    if (this.formsManagerConfigPeriodIncludeDeprecatedTemplates != null) {
      json[r'formsManagerConfig.includeDeprecatedTemplates'] = this.formsManagerConfigPeriodIncludeDeprecatedTemplates;
    } else {
      json[r'formsManagerConfig.includeDeprecatedTemplates'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties(
        formsManagerConfigPeriodIncludeOOTBTemplates: ConfigNodePropertyBoolean.fromJson(json[r'formsManagerConfig.includeOOTBTemplates']),
        formsManagerConfigPeriodIncludeDeprecatedTemplates: ConfigNodePropertyBoolean.fromJson(json[r'formsManagerConfig.includeDeprecatedTemplates']),
      );
    }
    return null;
  }

  static List<ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties-objects as value to a dart map
  static Map<String, List<ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

