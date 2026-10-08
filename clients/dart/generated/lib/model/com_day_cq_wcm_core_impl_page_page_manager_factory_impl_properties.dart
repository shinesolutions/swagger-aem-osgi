//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties {
  /// Returns a new [ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties] instance.
  ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties({
    this.illegalCharMapping,
    this.pageSubTreeActivationCheck,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? illegalCharMapping;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? pageSubTreeActivationCheck;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties &&
    other.illegalCharMapping == illegalCharMapping &&
    other.pageSubTreeActivationCheck == pageSubTreeActivationCheck;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (illegalCharMapping == null ? 0 : illegalCharMapping!.hashCode) +
    (pageSubTreeActivationCheck == null ? 0 : pageSubTreeActivationCheck!.hashCode);

  @override
  String toString() => 'ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties[illegalCharMapping=$illegalCharMapping, pageSubTreeActivationCheck=$pageSubTreeActivationCheck]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.illegalCharMapping != null) {
      json[r'illegalCharMapping'] = this.illegalCharMapping;
    } else {
      json[r'illegalCharMapping'] = null;
    }
    if (this.pageSubTreeActivationCheck != null) {
      json[r'pageSubTreeActivationCheck'] = this.pageSubTreeActivationCheck;
    } else {
      json[r'pageSubTreeActivationCheck'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties(
        illegalCharMapping: ConfigNodePropertyString.fromJson(json[r'illegalCharMapping']),
        pageSubTreeActivationCheck: ConfigNodePropertyBoolean.fromJson(json[r'pageSubTreeActivationCheck']),
      );
    }
    return null;
  }

  static List<ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties-objects as value to a dart map
  static Map<String, List<ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

