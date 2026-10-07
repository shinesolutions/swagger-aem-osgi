//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeGraniteWorkflowCoreWorkflowConfigProperties {
  /// Returns a new [ComAdobeGraniteWorkflowCoreWorkflowConfigProperties] instance.
  ComAdobeGraniteWorkflowCoreWorkflowConfigProperties({
    this.cqPeriodWorkflowPeriodConfigPeriodWorkflowPeriodPackagesPeriodRootPeriodPath,
    this.cqPeriodWorkflowPeriodConfigPeriodWorkflowPeriodProcessPeriodLegacyPeriodMode,
    this.cqPeriodWorkflowPeriodConfigPeriodAllowPeriodLocking,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? cqPeriodWorkflowPeriodConfigPeriodWorkflowPeriodPackagesPeriodRootPeriodPath;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? cqPeriodWorkflowPeriodConfigPeriodWorkflowPeriodProcessPeriodLegacyPeriodMode;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? cqPeriodWorkflowPeriodConfigPeriodAllowPeriodLocking;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeGraniteWorkflowCoreWorkflowConfigProperties &&
    other.cqPeriodWorkflowPeriodConfigPeriodWorkflowPeriodPackagesPeriodRootPeriodPath == cqPeriodWorkflowPeriodConfigPeriodWorkflowPeriodPackagesPeriodRootPeriodPath &&
    other.cqPeriodWorkflowPeriodConfigPeriodWorkflowPeriodProcessPeriodLegacyPeriodMode == cqPeriodWorkflowPeriodConfigPeriodWorkflowPeriodProcessPeriodLegacyPeriodMode &&
    other.cqPeriodWorkflowPeriodConfigPeriodAllowPeriodLocking == cqPeriodWorkflowPeriodConfigPeriodAllowPeriodLocking;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (cqPeriodWorkflowPeriodConfigPeriodWorkflowPeriodPackagesPeriodRootPeriodPath == null ? 0 : cqPeriodWorkflowPeriodConfigPeriodWorkflowPeriodPackagesPeriodRootPeriodPath!.hashCode) +
    (cqPeriodWorkflowPeriodConfigPeriodWorkflowPeriodProcessPeriodLegacyPeriodMode == null ? 0 : cqPeriodWorkflowPeriodConfigPeriodWorkflowPeriodProcessPeriodLegacyPeriodMode!.hashCode) +
    (cqPeriodWorkflowPeriodConfigPeriodAllowPeriodLocking == null ? 0 : cqPeriodWorkflowPeriodConfigPeriodAllowPeriodLocking!.hashCode);

  @override
  String toString() => 'ComAdobeGraniteWorkflowCoreWorkflowConfigProperties[cqPeriodWorkflowPeriodConfigPeriodWorkflowPeriodPackagesPeriodRootPeriodPath=$cqPeriodWorkflowPeriodConfigPeriodWorkflowPeriodPackagesPeriodRootPeriodPath, cqPeriodWorkflowPeriodConfigPeriodWorkflowPeriodProcessPeriodLegacyPeriodMode=$cqPeriodWorkflowPeriodConfigPeriodWorkflowPeriodProcessPeriodLegacyPeriodMode, cqPeriodWorkflowPeriodConfigPeriodAllowPeriodLocking=$cqPeriodWorkflowPeriodConfigPeriodAllowPeriodLocking]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.cqPeriodWorkflowPeriodConfigPeriodWorkflowPeriodPackagesPeriodRootPeriodPath != null) {
      json[r'cq.workflow.config.workflow.packages.root.path'] = this.cqPeriodWorkflowPeriodConfigPeriodWorkflowPeriodPackagesPeriodRootPeriodPath;
    } else {
      json[r'cq.workflow.config.workflow.packages.root.path'] = null;
    }
    if (this.cqPeriodWorkflowPeriodConfigPeriodWorkflowPeriodProcessPeriodLegacyPeriodMode != null) {
      json[r'cq.workflow.config.workflow.process.legacy.mode'] = this.cqPeriodWorkflowPeriodConfigPeriodWorkflowPeriodProcessPeriodLegacyPeriodMode;
    } else {
      json[r'cq.workflow.config.workflow.process.legacy.mode'] = null;
    }
    if (this.cqPeriodWorkflowPeriodConfigPeriodAllowPeriodLocking != null) {
      json[r'cq.workflow.config.allow.locking'] = this.cqPeriodWorkflowPeriodConfigPeriodAllowPeriodLocking;
    } else {
      json[r'cq.workflow.config.allow.locking'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeGraniteWorkflowCoreWorkflowConfigProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeGraniteWorkflowCoreWorkflowConfigProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeGraniteWorkflowCoreWorkflowConfigProperties(
        cqPeriodWorkflowPeriodConfigPeriodWorkflowPeriodPackagesPeriodRootPeriodPath: ConfigNodePropertyArray.fromJson(json[r'cq.workflow.config.workflow.packages.root.path']),
        cqPeriodWorkflowPeriodConfigPeriodWorkflowPeriodProcessPeriodLegacyPeriodMode: ConfigNodePropertyBoolean.fromJson(json[r'cq.workflow.config.workflow.process.legacy.mode']),
        cqPeriodWorkflowPeriodConfigPeriodAllowPeriodLocking: ConfigNodePropertyBoolean.fromJson(json[r'cq.workflow.config.allow.locking']),
      );
    }
    return null;
  }

  static List<ComAdobeGraniteWorkflowCoreWorkflowConfigProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeGraniteWorkflowCoreWorkflowConfigProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeGraniteWorkflowCoreWorkflowConfigProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeGraniteWorkflowCoreWorkflowConfigProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeGraniteWorkflowCoreWorkflowConfigProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeGraniteWorkflowCoreWorkflowConfigProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeGraniteWorkflowCoreWorkflowConfigProperties-objects as value to a dart map
  static Map<String, List<ComAdobeGraniteWorkflowCoreWorkflowConfigProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeGraniteWorkflowCoreWorkflowConfigProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeGraniteWorkflowCoreWorkflowConfigProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

