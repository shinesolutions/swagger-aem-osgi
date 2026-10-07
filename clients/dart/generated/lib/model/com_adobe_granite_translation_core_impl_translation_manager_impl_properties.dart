//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties {
  /// Returns a new [ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties] instance.
  ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties({
    this.defaultConnectorName,
    this.defaultCategory,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? defaultConnectorName;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? defaultCategory;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties &&
    other.defaultConnectorName == defaultConnectorName &&
    other.defaultCategory == defaultCategory;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (defaultConnectorName == null ? 0 : defaultConnectorName!.hashCode) +
    (defaultCategory == null ? 0 : defaultCategory!.hashCode);

  @override
  String toString() => 'ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties[defaultConnectorName=$defaultConnectorName, defaultCategory=$defaultCategory]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.defaultConnectorName != null) {
      json[r'defaultConnectorName'] = this.defaultConnectorName;
    } else {
      json[r'defaultConnectorName'] = null;
    }
    if (this.defaultCategory != null) {
      json[r'defaultCategory'] = this.defaultCategory;
    } else {
      json[r'defaultCategory'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties(
        defaultConnectorName: ConfigNodePropertyString.fromJson(json[r'defaultConnectorName']),
        defaultCategory: ConfigNodePropertyString.fromJson(json[r'defaultCategory']),
      );
    }
    return null;
  }

  static List<ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties-objects as value to a dart map
  static Map<String, List<ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

