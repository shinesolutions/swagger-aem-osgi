//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties {
  /// Returns a new [ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties] instance.
  ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties({
    this.adapterPeriodCondition,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? adapterPeriodCondition;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties &&
    other.adapterPeriodCondition == adapterPeriodCondition;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (adapterPeriodCondition == null ? 0 : adapterPeriodCondition!.hashCode);

  @override
  String toString() => 'ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties[adapterPeriodCondition=$adapterPeriodCondition]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.adapterPeriodCondition != null) {
      json[r'adapter.condition'] = this.adapterPeriodCondition;
    } else {
      json[r'adapter.condition'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties(
        adapterPeriodCondition: ConfigNodePropertyString.fromJson(json[r'adapter.condition']),
      );
    }
    return null;
  }

  static List<ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties-objects as value to a dart map
  static Map<String, List<ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

