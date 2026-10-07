//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties {
  /// Returns a new [OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties] instance.
  OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties({
    this.name,
    this.title,
    this.details,
    this.enabled,
    this.serviceName,
    this.logPeriodLevel,
    this.queuePeriodProcessingPeriodEnabled,
    this.packageExporterPeriodTarget,
    this.packageImporterPeriodTarget,
    this.requestAuthorizationStrategyPeriodTarget,
    this.triggersPeriodTarget,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? name;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? title;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? details;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? enabled;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? serviceName;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyDropDown? logPeriodLevel;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? queuePeriodProcessingPeriodEnabled;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? packageExporterPeriodTarget;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? packageImporterPeriodTarget;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? requestAuthorizationStrategyPeriodTarget;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? triggersPeriodTarget;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties &&
    other.name == name &&
    other.title == title &&
    other.details == details &&
    other.enabled == enabled &&
    other.serviceName == serviceName &&
    other.logPeriodLevel == logPeriodLevel &&
    other.queuePeriodProcessingPeriodEnabled == queuePeriodProcessingPeriodEnabled &&
    other.packageExporterPeriodTarget == packageExporterPeriodTarget &&
    other.packageImporterPeriodTarget == packageImporterPeriodTarget &&
    other.requestAuthorizationStrategyPeriodTarget == requestAuthorizationStrategyPeriodTarget &&
    other.triggersPeriodTarget == triggersPeriodTarget;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (name == null ? 0 : name!.hashCode) +
    (title == null ? 0 : title!.hashCode) +
    (details == null ? 0 : details!.hashCode) +
    (enabled == null ? 0 : enabled!.hashCode) +
    (serviceName == null ? 0 : serviceName!.hashCode) +
    (logPeriodLevel == null ? 0 : logPeriodLevel!.hashCode) +
    (queuePeriodProcessingPeriodEnabled == null ? 0 : queuePeriodProcessingPeriodEnabled!.hashCode) +
    (packageExporterPeriodTarget == null ? 0 : packageExporterPeriodTarget!.hashCode) +
    (packageImporterPeriodTarget == null ? 0 : packageImporterPeriodTarget!.hashCode) +
    (requestAuthorizationStrategyPeriodTarget == null ? 0 : requestAuthorizationStrategyPeriodTarget!.hashCode) +
    (triggersPeriodTarget == null ? 0 : triggersPeriodTarget!.hashCode);

  @override
  String toString() => 'OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties[name=$name, title=$title, details=$details, enabled=$enabled, serviceName=$serviceName, logPeriodLevel=$logPeriodLevel, queuePeriodProcessingPeriodEnabled=$queuePeriodProcessingPeriodEnabled, packageExporterPeriodTarget=$packageExporterPeriodTarget, packageImporterPeriodTarget=$packageImporterPeriodTarget, requestAuthorizationStrategyPeriodTarget=$requestAuthorizationStrategyPeriodTarget, triggersPeriodTarget=$triggersPeriodTarget]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
    if (this.title != null) {
      json[r'title'] = this.title;
    } else {
      json[r'title'] = null;
    }
    if (this.details != null) {
      json[r'details'] = this.details;
    } else {
      json[r'details'] = null;
    }
    if (this.enabled != null) {
      json[r'enabled'] = this.enabled;
    } else {
      json[r'enabled'] = null;
    }
    if (this.serviceName != null) {
      json[r'serviceName'] = this.serviceName;
    } else {
      json[r'serviceName'] = null;
    }
    if (this.logPeriodLevel != null) {
      json[r'log.level'] = this.logPeriodLevel;
    } else {
      json[r'log.level'] = null;
    }
    if (this.queuePeriodProcessingPeriodEnabled != null) {
      json[r'queue.processing.enabled'] = this.queuePeriodProcessingPeriodEnabled;
    } else {
      json[r'queue.processing.enabled'] = null;
    }
    if (this.packageExporterPeriodTarget != null) {
      json[r'packageExporter.target'] = this.packageExporterPeriodTarget;
    } else {
      json[r'packageExporter.target'] = null;
    }
    if (this.packageImporterPeriodTarget != null) {
      json[r'packageImporter.target'] = this.packageImporterPeriodTarget;
    } else {
      json[r'packageImporter.target'] = null;
    }
    if (this.requestAuthorizationStrategyPeriodTarget != null) {
      json[r'requestAuthorizationStrategy.target'] = this.requestAuthorizationStrategyPeriodTarget;
    } else {
      json[r'requestAuthorizationStrategy.target'] = null;
    }
    if (this.triggersPeriodTarget != null) {
      json[r'triggers.target'] = this.triggersPeriodTarget;
    } else {
      json[r'triggers.target'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties(
        name: ConfigNodePropertyString.fromJson(json[r'name']),
        title: ConfigNodePropertyString.fromJson(json[r'title']),
        details: ConfigNodePropertyString.fromJson(json[r'details']),
        enabled: ConfigNodePropertyBoolean.fromJson(json[r'enabled']),
        serviceName: ConfigNodePropertyString.fromJson(json[r'serviceName']),
        logPeriodLevel: ConfigNodePropertyDropDown.fromJson(json[r'log.level']),
        queuePeriodProcessingPeriodEnabled: ConfigNodePropertyBoolean.fromJson(json[r'queue.processing.enabled']),
        packageExporterPeriodTarget: ConfigNodePropertyString.fromJson(json[r'packageExporter.target']),
        packageImporterPeriodTarget: ConfigNodePropertyString.fromJson(json[r'packageImporter.target']),
        requestAuthorizationStrategyPeriodTarget: ConfigNodePropertyString.fromJson(json[r'requestAuthorizationStrategy.target']),
        triggersPeriodTarget: ConfigNodePropertyString.fromJson(json[r'triggers.target']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

