//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties {
  /// Returns a new [OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties] instance.
  OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties({
    this.name,
    this.title,
    this.details,
    this.enabled,
    this.serviceName,
    this.logPeriodLevel,
    this.allowedPeriodRoots,
    this.requestAuthorizationStrategyPeriodTarget,
    this.queueProviderFactoryPeriodTarget,
    this.packageBuilderPeriodTarget,
    this.triggersPeriodTarget,
    this.priorityQueues,
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
  ConfigNodePropertyArray? allowedPeriodRoots;

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
  ConfigNodePropertyString? queueProviderFactoryPeriodTarget;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? packageBuilderPeriodTarget;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? triggersPeriodTarget;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? priorityQueues;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties &&
    other.name == name &&
    other.title == title &&
    other.details == details &&
    other.enabled == enabled &&
    other.serviceName == serviceName &&
    other.logPeriodLevel == logPeriodLevel &&
    other.allowedPeriodRoots == allowedPeriodRoots &&
    other.requestAuthorizationStrategyPeriodTarget == requestAuthorizationStrategyPeriodTarget &&
    other.queueProviderFactoryPeriodTarget == queueProviderFactoryPeriodTarget &&
    other.packageBuilderPeriodTarget == packageBuilderPeriodTarget &&
    other.triggersPeriodTarget == triggersPeriodTarget &&
    other.priorityQueues == priorityQueues;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (name == null ? 0 : name!.hashCode) +
    (title == null ? 0 : title!.hashCode) +
    (details == null ? 0 : details!.hashCode) +
    (enabled == null ? 0 : enabled!.hashCode) +
    (serviceName == null ? 0 : serviceName!.hashCode) +
    (logPeriodLevel == null ? 0 : logPeriodLevel!.hashCode) +
    (allowedPeriodRoots == null ? 0 : allowedPeriodRoots!.hashCode) +
    (requestAuthorizationStrategyPeriodTarget == null ? 0 : requestAuthorizationStrategyPeriodTarget!.hashCode) +
    (queueProviderFactoryPeriodTarget == null ? 0 : queueProviderFactoryPeriodTarget!.hashCode) +
    (packageBuilderPeriodTarget == null ? 0 : packageBuilderPeriodTarget!.hashCode) +
    (triggersPeriodTarget == null ? 0 : triggersPeriodTarget!.hashCode) +
    (priorityQueues == null ? 0 : priorityQueues!.hashCode);

  @override
  String toString() => 'OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties[name=$name, title=$title, details=$details, enabled=$enabled, serviceName=$serviceName, logPeriodLevel=$logPeriodLevel, allowedPeriodRoots=$allowedPeriodRoots, requestAuthorizationStrategyPeriodTarget=$requestAuthorizationStrategyPeriodTarget, queueProviderFactoryPeriodTarget=$queueProviderFactoryPeriodTarget, packageBuilderPeriodTarget=$packageBuilderPeriodTarget, triggersPeriodTarget=$triggersPeriodTarget, priorityQueues=$priorityQueues]';

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
    if (this.allowedPeriodRoots != null) {
      json[r'allowed.roots'] = this.allowedPeriodRoots;
    } else {
      json[r'allowed.roots'] = null;
    }
    if (this.requestAuthorizationStrategyPeriodTarget != null) {
      json[r'requestAuthorizationStrategy.target'] = this.requestAuthorizationStrategyPeriodTarget;
    } else {
      json[r'requestAuthorizationStrategy.target'] = null;
    }
    if (this.queueProviderFactoryPeriodTarget != null) {
      json[r'queueProviderFactory.target'] = this.queueProviderFactoryPeriodTarget;
    } else {
      json[r'queueProviderFactory.target'] = null;
    }
    if (this.packageBuilderPeriodTarget != null) {
      json[r'packageBuilder.target'] = this.packageBuilderPeriodTarget;
    } else {
      json[r'packageBuilder.target'] = null;
    }
    if (this.triggersPeriodTarget != null) {
      json[r'triggers.target'] = this.triggersPeriodTarget;
    } else {
      json[r'triggers.target'] = null;
    }
    if (this.priorityQueues != null) {
      json[r'priorityQueues'] = this.priorityQueues;
    } else {
      json[r'priorityQueues'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties(
        name: ConfigNodePropertyString.fromJson(json[r'name']),
        title: ConfigNodePropertyString.fromJson(json[r'title']),
        details: ConfigNodePropertyString.fromJson(json[r'details']),
        enabled: ConfigNodePropertyBoolean.fromJson(json[r'enabled']),
        serviceName: ConfigNodePropertyString.fromJson(json[r'serviceName']),
        logPeriodLevel: ConfigNodePropertyDropDown.fromJson(json[r'log.level']),
        allowedPeriodRoots: ConfigNodePropertyArray.fromJson(json[r'allowed.roots']),
        requestAuthorizationStrategyPeriodTarget: ConfigNodePropertyString.fromJson(json[r'requestAuthorizationStrategy.target']),
        queueProviderFactoryPeriodTarget: ConfigNodePropertyString.fromJson(json[r'queueProviderFactory.target']),
        packageBuilderPeriodTarget: ConfigNodePropertyString.fromJson(json[r'packageBuilder.target']),
        triggersPeriodTarget: ConfigNodePropertyString.fromJson(json[r'triggers.target']),
        priorityQueues: ConfigNodePropertyArray.fromJson(json[r'priorityQueues']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

