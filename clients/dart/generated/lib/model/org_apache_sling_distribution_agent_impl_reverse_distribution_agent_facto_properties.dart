//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties {
  /// Returns a new [OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties] instance.
  OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties({
    this.name,
    this.title,
    this.details,
    this.enabled,
    this.serviceName,
    this.logPeriodLevel,
    this.queuePeriodProcessingPeriodEnabled,
    this.packageExporterPeriodEndpoints,
    this.pullPeriodItems,
    this.httpPeriodConnPeriodTimeout,
    this.requestAuthorizationStrategyPeriodTarget,
    this.transportSecretProviderPeriodTarget,
    this.packageBuilderPeriodTarget,
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
  ConfigNodePropertyArray? packageExporterPeriodEndpoints;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? pullPeriodItems;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? httpPeriodConnPeriodTimeout;

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
  ConfigNodePropertyString? transportSecretProviderPeriodTarget;

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

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties &&
    other.name == name &&
    other.title == title &&
    other.details == details &&
    other.enabled == enabled &&
    other.serviceName == serviceName &&
    other.logPeriodLevel == logPeriodLevel &&
    other.queuePeriodProcessingPeriodEnabled == queuePeriodProcessingPeriodEnabled &&
    other.packageExporterPeriodEndpoints == packageExporterPeriodEndpoints &&
    other.pullPeriodItems == pullPeriodItems &&
    other.httpPeriodConnPeriodTimeout == httpPeriodConnPeriodTimeout &&
    other.requestAuthorizationStrategyPeriodTarget == requestAuthorizationStrategyPeriodTarget &&
    other.transportSecretProviderPeriodTarget == transportSecretProviderPeriodTarget &&
    other.packageBuilderPeriodTarget == packageBuilderPeriodTarget &&
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
    (packageExporterPeriodEndpoints == null ? 0 : packageExporterPeriodEndpoints!.hashCode) +
    (pullPeriodItems == null ? 0 : pullPeriodItems!.hashCode) +
    (httpPeriodConnPeriodTimeout == null ? 0 : httpPeriodConnPeriodTimeout!.hashCode) +
    (requestAuthorizationStrategyPeriodTarget == null ? 0 : requestAuthorizationStrategyPeriodTarget!.hashCode) +
    (transportSecretProviderPeriodTarget == null ? 0 : transportSecretProviderPeriodTarget!.hashCode) +
    (packageBuilderPeriodTarget == null ? 0 : packageBuilderPeriodTarget!.hashCode) +
    (triggersPeriodTarget == null ? 0 : triggersPeriodTarget!.hashCode);

  @override
  String toString() => 'OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties[name=$name, title=$title, details=$details, enabled=$enabled, serviceName=$serviceName, logPeriodLevel=$logPeriodLevel, queuePeriodProcessingPeriodEnabled=$queuePeriodProcessingPeriodEnabled, packageExporterPeriodEndpoints=$packageExporterPeriodEndpoints, pullPeriodItems=$pullPeriodItems, httpPeriodConnPeriodTimeout=$httpPeriodConnPeriodTimeout, requestAuthorizationStrategyPeriodTarget=$requestAuthorizationStrategyPeriodTarget, transportSecretProviderPeriodTarget=$transportSecretProviderPeriodTarget, packageBuilderPeriodTarget=$packageBuilderPeriodTarget, triggersPeriodTarget=$triggersPeriodTarget]';

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
    if (this.packageExporterPeriodEndpoints != null) {
      json[r'packageExporter.endpoints'] = this.packageExporterPeriodEndpoints;
    } else {
      json[r'packageExporter.endpoints'] = null;
    }
    if (this.pullPeriodItems != null) {
      json[r'pull.items'] = this.pullPeriodItems;
    } else {
      json[r'pull.items'] = null;
    }
    if (this.httpPeriodConnPeriodTimeout != null) {
      json[r'http.conn.timeout'] = this.httpPeriodConnPeriodTimeout;
    } else {
      json[r'http.conn.timeout'] = null;
    }
    if (this.requestAuthorizationStrategyPeriodTarget != null) {
      json[r'requestAuthorizationStrategy.target'] = this.requestAuthorizationStrategyPeriodTarget;
    } else {
      json[r'requestAuthorizationStrategy.target'] = null;
    }
    if (this.transportSecretProviderPeriodTarget != null) {
      json[r'transportSecretProvider.target'] = this.transportSecretProviderPeriodTarget;
    } else {
      json[r'transportSecretProvider.target'] = null;
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
    return json;
  }

  /// Returns a new [OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties(
        name: ConfigNodePropertyString.fromJson(json[r'name']),
        title: ConfigNodePropertyString.fromJson(json[r'title']),
        details: ConfigNodePropertyString.fromJson(json[r'details']),
        enabled: ConfigNodePropertyBoolean.fromJson(json[r'enabled']),
        serviceName: ConfigNodePropertyString.fromJson(json[r'serviceName']),
        logPeriodLevel: ConfigNodePropertyDropDown.fromJson(json[r'log.level']),
        queuePeriodProcessingPeriodEnabled: ConfigNodePropertyBoolean.fromJson(json[r'queue.processing.enabled']),
        packageExporterPeriodEndpoints: ConfigNodePropertyArray.fromJson(json[r'packageExporter.endpoints']),
        pullPeriodItems: ConfigNodePropertyInteger.fromJson(json[r'pull.items']),
        httpPeriodConnPeriodTimeout: ConfigNodePropertyInteger.fromJson(json[r'http.conn.timeout']),
        requestAuthorizationStrategyPeriodTarget: ConfigNodePropertyString.fromJson(json[r'requestAuthorizationStrategy.target']),
        transportSecretProviderPeriodTarget: ConfigNodePropertyString.fromJson(json[r'transportSecretProvider.target']),
        packageBuilderPeriodTarget: ConfigNodePropertyString.fromJson(json[r'packageBuilder.target']),
        triggersPeriodTarget: ConfigNodePropertyString.fromJson(json[r'triggers.target']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

