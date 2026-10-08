//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqDamIdsImplIDSPoolManagerImplProperties {
  /// Returns a new [ComDayCqDamIdsImplIDSPoolManagerImplProperties] instance.
  ComDayCqDamIdsImplIDSPoolManagerImplProperties({
    this.maxPeriodErrorsPeriodToPeriodBlacklist,
    this.retryPeriodIntervalPeriodToPeriodWhitelist,
    this.connectPeriodTimeout,
    this.socketPeriodTimeout,
    this.processPeriodLabel,
    this.connectionPeriodUsePeriodMax,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? maxPeriodErrorsPeriodToPeriodBlacklist;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? retryPeriodIntervalPeriodToPeriodWhitelist;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? connectPeriodTimeout;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? socketPeriodTimeout;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? processPeriodLabel;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? connectionPeriodUsePeriodMax;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqDamIdsImplIDSPoolManagerImplProperties &&
    other.maxPeriodErrorsPeriodToPeriodBlacklist == maxPeriodErrorsPeriodToPeriodBlacklist &&
    other.retryPeriodIntervalPeriodToPeriodWhitelist == retryPeriodIntervalPeriodToPeriodWhitelist &&
    other.connectPeriodTimeout == connectPeriodTimeout &&
    other.socketPeriodTimeout == socketPeriodTimeout &&
    other.processPeriodLabel == processPeriodLabel &&
    other.connectionPeriodUsePeriodMax == connectionPeriodUsePeriodMax;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (maxPeriodErrorsPeriodToPeriodBlacklist == null ? 0 : maxPeriodErrorsPeriodToPeriodBlacklist!.hashCode) +
    (retryPeriodIntervalPeriodToPeriodWhitelist == null ? 0 : retryPeriodIntervalPeriodToPeriodWhitelist!.hashCode) +
    (connectPeriodTimeout == null ? 0 : connectPeriodTimeout!.hashCode) +
    (socketPeriodTimeout == null ? 0 : socketPeriodTimeout!.hashCode) +
    (processPeriodLabel == null ? 0 : processPeriodLabel!.hashCode) +
    (connectionPeriodUsePeriodMax == null ? 0 : connectionPeriodUsePeriodMax!.hashCode);

  @override
  String toString() => 'ComDayCqDamIdsImplIDSPoolManagerImplProperties[maxPeriodErrorsPeriodToPeriodBlacklist=$maxPeriodErrorsPeriodToPeriodBlacklist, retryPeriodIntervalPeriodToPeriodWhitelist=$retryPeriodIntervalPeriodToPeriodWhitelist, connectPeriodTimeout=$connectPeriodTimeout, socketPeriodTimeout=$socketPeriodTimeout, processPeriodLabel=$processPeriodLabel, connectionPeriodUsePeriodMax=$connectionPeriodUsePeriodMax]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.maxPeriodErrorsPeriodToPeriodBlacklist != null) {
      json[r'max.errors.to.blacklist'] = this.maxPeriodErrorsPeriodToPeriodBlacklist;
    } else {
      json[r'max.errors.to.blacklist'] = null;
    }
    if (this.retryPeriodIntervalPeriodToPeriodWhitelist != null) {
      json[r'retry.interval.to.whitelist'] = this.retryPeriodIntervalPeriodToPeriodWhitelist;
    } else {
      json[r'retry.interval.to.whitelist'] = null;
    }
    if (this.connectPeriodTimeout != null) {
      json[r'connect.timeout'] = this.connectPeriodTimeout;
    } else {
      json[r'connect.timeout'] = null;
    }
    if (this.socketPeriodTimeout != null) {
      json[r'socket.timeout'] = this.socketPeriodTimeout;
    } else {
      json[r'socket.timeout'] = null;
    }
    if (this.processPeriodLabel != null) {
      json[r'process.label'] = this.processPeriodLabel;
    } else {
      json[r'process.label'] = null;
    }
    if (this.connectionPeriodUsePeriodMax != null) {
      json[r'connection.use.max'] = this.connectionPeriodUsePeriodMax;
    } else {
      json[r'connection.use.max'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqDamIdsImplIDSPoolManagerImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqDamIdsImplIDSPoolManagerImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqDamIdsImplIDSPoolManagerImplProperties(
        maxPeriodErrorsPeriodToPeriodBlacklist: ConfigNodePropertyInteger.fromJson(json[r'max.errors.to.blacklist']),
        retryPeriodIntervalPeriodToPeriodWhitelist: ConfigNodePropertyInteger.fromJson(json[r'retry.interval.to.whitelist']),
        connectPeriodTimeout: ConfigNodePropertyInteger.fromJson(json[r'connect.timeout']),
        socketPeriodTimeout: ConfigNodePropertyInteger.fromJson(json[r'socket.timeout']),
        processPeriodLabel: ConfigNodePropertyString.fromJson(json[r'process.label']),
        connectionPeriodUsePeriodMax: ConfigNodePropertyInteger.fromJson(json[r'connection.use.max']),
      );
    }
    return null;
  }

  static List<ComDayCqDamIdsImplIDSPoolManagerImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqDamIdsImplIDSPoolManagerImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqDamIdsImplIDSPoolManagerImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqDamIdsImplIDSPoolManagerImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqDamIdsImplIDSPoolManagerImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqDamIdsImplIDSPoolManagerImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqDamIdsImplIDSPoolManagerImplProperties-objects as value to a dart map
  static Map<String, List<ComDayCqDamIdsImplIDSPoolManagerImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqDamIdsImplIDSPoolManagerImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqDamIdsImplIDSPoolManagerImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

