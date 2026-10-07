//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties {
  /// Returns a new [ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties] instance.
  ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties({
    this.tempStorageConfig,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyDropDown? tempStorageConfig;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties &&
    other.tempStorageConfig == tempStorageConfig;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (tempStorageConfig == null ? 0 : tempStorageConfig!.hashCode);

  @override
  String toString() => 'ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties[tempStorageConfig=$tempStorageConfig]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.tempStorageConfig != null) {
      json[r'tempStorageConfig'] = this.tempStorageConfig;
    } else {
      json[r'tempStorageConfig'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties(
        tempStorageConfig: ConfigNodePropertyDropDown.fromJson(json[r'tempStorageConfig']),
      );
    }
    return null;
  }

  static List<ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties-objects as value to a dart map
  static Map<String, List<ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

