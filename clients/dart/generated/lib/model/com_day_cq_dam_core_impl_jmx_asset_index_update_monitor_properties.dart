//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties {
  /// Returns a new [ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties] instance.
  ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties({
    this.jmxPeriodObjectname,
    this.propertyPeriodMeasurePeriodEnabled,
    this.propertyPeriodName,
    this.propertyPeriodMaxPeriodWaitPeriodMs,
    this.propertyPeriodMaxPeriodRate,
    this.fulltextPeriodMeasurePeriodEnabled,
    this.fulltextPeriodName,
    this.fulltextPeriodMaxPeriodWaitPeriodMs,
    this.fulltextPeriodMaxPeriodRate,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? jmxPeriodObjectname;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? propertyPeriodMeasurePeriodEnabled;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? propertyPeriodName;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? propertyPeriodMaxPeriodWaitPeriodMs;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyFloat? propertyPeriodMaxPeriodRate;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? fulltextPeriodMeasurePeriodEnabled;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? fulltextPeriodName;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? fulltextPeriodMaxPeriodWaitPeriodMs;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyFloat? fulltextPeriodMaxPeriodRate;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties &&
    other.jmxPeriodObjectname == jmxPeriodObjectname &&
    other.propertyPeriodMeasurePeriodEnabled == propertyPeriodMeasurePeriodEnabled &&
    other.propertyPeriodName == propertyPeriodName &&
    other.propertyPeriodMaxPeriodWaitPeriodMs == propertyPeriodMaxPeriodWaitPeriodMs &&
    other.propertyPeriodMaxPeriodRate == propertyPeriodMaxPeriodRate &&
    other.fulltextPeriodMeasurePeriodEnabled == fulltextPeriodMeasurePeriodEnabled &&
    other.fulltextPeriodName == fulltextPeriodName &&
    other.fulltextPeriodMaxPeriodWaitPeriodMs == fulltextPeriodMaxPeriodWaitPeriodMs &&
    other.fulltextPeriodMaxPeriodRate == fulltextPeriodMaxPeriodRate;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (jmxPeriodObjectname == null ? 0 : jmxPeriodObjectname!.hashCode) +
    (propertyPeriodMeasurePeriodEnabled == null ? 0 : propertyPeriodMeasurePeriodEnabled!.hashCode) +
    (propertyPeriodName == null ? 0 : propertyPeriodName!.hashCode) +
    (propertyPeriodMaxPeriodWaitPeriodMs == null ? 0 : propertyPeriodMaxPeriodWaitPeriodMs!.hashCode) +
    (propertyPeriodMaxPeriodRate == null ? 0 : propertyPeriodMaxPeriodRate!.hashCode) +
    (fulltextPeriodMeasurePeriodEnabled == null ? 0 : fulltextPeriodMeasurePeriodEnabled!.hashCode) +
    (fulltextPeriodName == null ? 0 : fulltextPeriodName!.hashCode) +
    (fulltextPeriodMaxPeriodWaitPeriodMs == null ? 0 : fulltextPeriodMaxPeriodWaitPeriodMs!.hashCode) +
    (fulltextPeriodMaxPeriodRate == null ? 0 : fulltextPeriodMaxPeriodRate!.hashCode);

  @override
  String toString() => 'ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties[jmxPeriodObjectname=$jmxPeriodObjectname, propertyPeriodMeasurePeriodEnabled=$propertyPeriodMeasurePeriodEnabled, propertyPeriodName=$propertyPeriodName, propertyPeriodMaxPeriodWaitPeriodMs=$propertyPeriodMaxPeriodWaitPeriodMs, propertyPeriodMaxPeriodRate=$propertyPeriodMaxPeriodRate, fulltextPeriodMeasurePeriodEnabled=$fulltextPeriodMeasurePeriodEnabled, fulltextPeriodName=$fulltextPeriodName, fulltextPeriodMaxPeriodWaitPeriodMs=$fulltextPeriodMaxPeriodWaitPeriodMs, fulltextPeriodMaxPeriodRate=$fulltextPeriodMaxPeriodRate]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.jmxPeriodObjectname != null) {
      json[r'jmx.objectname'] = this.jmxPeriodObjectname;
    } else {
      json[r'jmx.objectname'] = null;
    }
    if (this.propertyPeriodMeasurePeriodEnabled != null) {
      json[r'property.measure.enabled'] = this.propertyPeriodMeasurePeriodEnabled;
    } else {
      json[r'property.measure.enabled'] = null;
    }
    if (this.propertyPeriodName != null) {
      json[r'property.name'] = this.propertyPeriodName;
    } else {
      json[r'property.name'] = null;
    }
    if (this.propertyPeriodMaxPeriodWaitPeriodMs != null) {
      json[r'property.max.wait.ms'] = this.propertyPeriodMaxPeriodWaitPeriodMs;
    } else {
      json[r'property.max.wait.ms'] = null;
    }
    if (this.propertyPeriodMaxPeriodRate != null) {
      json[r'property.max.rate'] = this.propertyPeriodMaxPeriodRate;
    } else {
      json[r'property.max.rate'] = null;
    }
    if (this.fulltextPeriodMeasurePeriodEnabled != null) {
      json[r'fulltext.measure.enabled'] = this.fulltextPeriodMeasurePeriodEnabled;
    } else {
      json[r'fulltext.measure.enabled'] = null;
    }
    if (this.fulltextPeriodName != null) {
      json[r'fulltext.name'] = this.fulltextPeriodName;
    } else {
      json[r'fulltext.name'] = null;
    }
    if (this.fulltextPeriodMaxPeriodWaitPeriodMs != null) {
      json[r'fulltext.max.wait.ms'] = this.fulltextPeriodMaxPeriodWaitPeriodMs;
    } else {
      json[r'fulltext.max.wait.ms'] = null;
    }
    if (this.fulltextPeriodMaxPeriodRate != null) {
      json[r'fulltext.max.rate'] = this.fulltextPeriodMaxPeriodRate;
    } else {
      json[r'fulltext.max.rate'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties(
        jmxPeriodObjectname: ConfigNodePropertyString.fromJson(json[r'jmx.objectname']),
        propertyPeriodMeasurePeriodEnabled: ConfigNodePropertyBoolean.fromJson(json[r'property.measure.enabled']),
        propertyPeriodName: ConfigNodePropertyString.fromJson(json[r'property.name']),
        propertyPeriodMaxPeriodWaitPeriodMs: ConfigNodePropertyInteger.fromJson(json[r'property.max.wait.ms']),
        propertyPeriodMaxPeriodRate: ConfigNodePropertyFloat.fromJson(json[r'property.max.rate']),
        fulltextPeriodMeasurePeriodEnabled: ConfigNodePropertyBoolean.fromJson(json[r'fulltext.measure.enabled']),
        fulltextPeriodName: ConfigNodePropertyString.fromJson(json[r'fulltext.name']),
        fulltextPeriodMaxPeriodWaitPeriodMs: ConfigNodePropertyInteger.fromJson(json[r'fulltext.max.wait.ms']),
        fulltextPeriodMaxPeriodRate: ConfigNodePropertyFloat.fromJson(json[r'fulltext.max.rate']),
      );
    }
    return null;
  }

  static List<ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties-objects as value to a dart map
  static Map<String, List<ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

