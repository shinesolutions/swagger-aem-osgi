//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties {
  /// Returns a new [ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties] instance.
  ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties({
    this.cqPeriodDamPeriodScene7PeriodConfigurationeventlistenerPeriodEnabled,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? cqPeriodDamPeriodScene7PeriodConfigurationeventlistenerPeriodEnabled;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties &&
    other.cqPeriodDamPeriodScene7PeriodConfigurationeventlistenerPeriodEnabled == cqPeriodDamPeriodScene7PeriodConfigurationeventlistenerPeriodEnabled;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (cqPeriodDamPeriodScene7PeriodConfigurationeventlistenerPeriodEnabled == null ? 0 : cqPeriodDamPeriodScene7PeriodConfigurationeventlistenerPeriodEnabled!.hashCode);

  @override
  String toString() => 'ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties[cqPeriodDamPeriodScene7PeriodConfigurationeventlistenerPeriodEnabled=$cqPeriodDamPeriodScene7PeriodConfigurationeventlistenerPeriodEnabled]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.cqPeriodDamPeriodScene7PeriodConfigurationeventlistenerPeriodEnabled != null) {
      json[r'cq.dam.scene7.configurationeventlistener.enabled'] = this.cqPeriodDamPeriodScene7PeriodConfigurationeventlistenerPeriodEnabled;
    } else {
      json[r'cq.dam.scene7.configurationeventlistener.enabled'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties(
        cqPeriodDamPeriodScene7PeriodConfigurationeventlistenerPeriodEnabled: ConfigNodePropertyBoolean.fromJson(json[r'cq.dam.scene7.configurationeventlistener.enabled']),
      );
    }
    return null;
  }

  static List<ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties-objects as value to a dart map
  static Map<String, List<ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

