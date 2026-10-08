//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties {
  /// Returns a new [ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties] instance.
  ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties({
    this.cqPeriodDamPeriodScene7PeriodDamchangeeventlistenerPeriodEnabled,
    this.cqPeriodDamPeriodScene7PeriodDamchangeeventlistenerPeriodObservedPeriodPaths,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? cqPeriodDamPeriodScene7PeriodDamchangeeventlistenerPeriodEnabled;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? cqPeriodDamPeriodScene7PeriodDamchangeeventlistenerPeriodObservedPeriodPaths;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties &&
    other.cqPeriodDamPeriodScene7PeriodDamchangeeventlistenerPeriodEnabled == cqPeriodDamPeriodScene7PeriodDamchangeeventlistenerPeriodEnabled &&
    other.cqPeriodDamPeriodScene7PeriodDamchangeeventlistenerPeriodObservedPeriodPaths == cqPeriodDamPeriodScene7PeriodDamchangeeventlistenerPeriodObservedPeriodPaths;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (cqPeriodDamPeriodScene7PeriodDamchangeeventlistenerPeriodEnabled == null ? 0 : cqPeriodDamPeriodScene7PeriodDamchangeeventlistenerPeriodEnabled!.hashCode) +
    (cqPeriodDamPeriodScene7PeriodDamchangeeventlistenerPeriodObservedPeriodPaths == null ? 0 : cqPeriodDamPeriodScene7PeriodDamchangeeventlistenerPeriodObservedPeriodPaths!.hashCode);

  @override
  String toString() => 'ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties[cqPeriodDamPeriodScene7PeriodDamchangeeventlistenerPeriodEnabled=$cqPeriodDamPeriodScene7PeriodDamchangeeventlistenerPeriodEnabled, cqPeriodDamPeriodScene7PeriodDamchangeeventlistenerPeriodObservedPeriodPaths=$cqPeriodDamPeriodScene7PeriodDamchangeeventlistenerPeriodObservedPeriodPaths]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.cqPeriodDamPeriodScene7PeriodDamchangeeventlistenerPeriodEnabled != null) {
      json[r'cq.dam.scene7.damchangeeventlistener.enabled'] = this.cqPeriodDamPeriodScene7PeriodDamchangeeventlistenerPeriodEnabled;
    } else {
      json[r'cq.dam.scene7.damchangeeventlistener.enabled'] = null;
    }
    if (this.cqPeriodDamPeriodScene7PeriodDamchangeeventlistenerPeriodObservedPeriodPaths != null) {
      json[r'cq.dam.scene7.damchangeeventlistener.observed.paths'] = this.cqPeriodDamPeriodScene7PeriodDamchangeeventlistenerPeriodObservedPeriodPaths;
    } else {
      json[r'cq.dam.scene7.damchangeeventlistener.observed.paths'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties(
        cqPeriodDamPeriodScene7PeriodDamchangeeventlistenerPeriodEnabled: ConfigNodePropertyBoolean.fromJson(json[r'cq.dam.scene7.damchangeeventlistener.enabled']),
        cqPeriodDamPeriodScene7PeriodDamchangeeventlistenerPeriodObservedPeriodPaths: ConfigNodePropertyArray.fromJson(json[r'cq.dam.scene7.damchangeeventlistener.observed.paths']),
      );
    }
    return null;
  }

  static List<ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties-objects as value to a dart map
  static Map<String, List<ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

