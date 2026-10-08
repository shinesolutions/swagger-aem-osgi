//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties {
  /// Returns a new [ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties] instance.
  ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties({
    this.cqPeriodAnalyticsPeriodSitecatalystPeriodServicePeriodDatacenterPeriodUrl,
    this.devhostnamepatterns,
    this.connectionPeriodTimeout,
    this.socketPeriodTimeout,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? cqPeriodAnalyticsPeriodSitecatalystPeriodServicePeriodDatacenterPeriodUrl;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? devhostnamepatterns;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? connectionPeriodTimeout;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? socketPeriodTimeout;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties &&
    other.cqPeriodAnalyticsPeriodSitecatalystPeriodServicePeriodDatacenterPeriodUrl == cqPeriodAnalyticsPeriodSitecatalystPeriodServicePeriodDatacenterPeriodUrl &&
    other.devhostnamepatterns == devhostnamepatterns &&
    other.connectionPeriodTimeout == connectionPeriodTimeout &&
    other.socketPeriodTimeout == socketPeriodTimeout;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (cqPeriodAnalyticsPeriodSitecatalystPeriodServicePeriodDatacenterPeriodUrl == null ? 0 : cqPeriodAnalyticsPeriodSitecatalystPeriodServicePeriodDatacenterPeriodUrl!.hashCode) +
    (devhostnamepatterns == null ? 0 : devhostnamepatterns!.hashCode) +
    (connectionPeriodTimeout == null ? 0 : connectionPeriodTimeout!.hashCode) +
    (socketPeriodTimeout == null ? 0 : socketPeriodTimeout!.hashCode);

  @override
  String toString() => 'ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties[cqPeriodAnalyticsPeriodSitecatalystPeriodServicePeriodDatacenterPeriodUrl=$cqPeriodAnalyticsPeriodSitecatalystPeriodServicePeriodDatacenterPeriodUrl, devhostnamepatterns=$devhostnamepatterns, connectionPeriodTimeout=$connectionPeriodTimeout, socketPeriodTimeout=$socketPeriodTimeout]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.cqPeriodAnalyticsPeriodSitecatalystPeriodServicePeriodDatacenterPeriodUrl != null) {
      json[r'cq.analytics.sitecatalyst.service.datacenter.url'] = this.cqPeriodAnalyticsPeriodSitecatalystPeriodServicePeriodDatacenterPeriodUrl;
    } else {
      json[r'cq.analytics.sitecatalyst.service.datacenter.url'] = null;
    }
    if (this.devhostnamepatterns != null) {
      json[r'devhostnamepatterns'] = this.devhostnamepatterns;
    } else {
      json[r'devhostnamepatterns'] = null;
    }
    if (this.connectionPeriodTimeout != null) {
      json[r'connection.timeout'] = this.connectionPeriodTimeout;
    } else {
      json[r'connection.timeout'] = null;
    }
    if (this.socketPeriodTimeout != null) {
      json[r'socket.timeout'] = this.socketPeriodTimeout;
    } else {
      json[r'socket.timeout'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties(
        cqPeriodAnalyticsPeriodSitecatalystPeriodServicePeriodDatacenterPeriodUrl: ConfigNodePropertyArray.fromJson(json[r'cq.analytics.sitecatalyst.service.datacenter.url']),
        devhostnamepatterns: ConfigNodePropertyArray.fromJson(json[r'devhostnamepatterns']),
        connectionPeriodTimeout: ConfigNodePropertyInteger.fromJson(json[r'connection.timeout']),
        socketPeriodTimeout: ConfigNodePropertyInteger.fromJson(json[r'socket.timeout']),
      );
    }
    return null;
  }

  static List<ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties-objects as value to a dart map
  static Map<String, List<ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

