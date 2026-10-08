//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties {
  /// Returns a new [ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties] instance.
  ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties({
    this.jdbcPeriodDriverPeriodClass,
    this.jdbcPeriodConnectionPeriodUri,
    this.jdbcPeriodUsername,
    this.jdbcPeriodPassword,
    this.jdbcPeriodValidationPeriodQuery,
    this.defaultPeriodReadonly,
    this.defaultPeriodAutocommit,
    this.poolPeriodSize,
    this.poolPeriodMaxPeriodWaitPeriodMsec,
    this.datasourcePeriodName,
    this.datasourcePeriodSvcPeriodProperties,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? jdbcPeriodDriverPeriodClass;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? jdbcPeriodConnectionPeriodUri;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? jdbcPeriodUsername;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? jdbcPeriodPassword;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? jdbcPeriodValidationPeriodQuery;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? defaultPeriodReadonly;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? defaultPeriodAutocommit;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? poolPeriodSize;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? poolPeriodMaxPeriodWaitPeriodMsec;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? datasourcePeriodName;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? datasourcePeriodSvcPeriodProperties;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties &&
    other.jdbcPeriodDriverPeriodClass == jdbcPeriodDriverPeriodClass &&
    other.jdbcPeriodConnectionPeriodUri == jdbcPeriodConnectionPeriodUri &&
    other.jdbcPeriodUsername == jdbcPeriodUsername &&
    other.jdbcPeriodPassword == jdbcPeriodPassword &&
    other.jdbcPeriodValidationPeriodQuery == jdbcPeriodValidationPeriodQuery &&
    other.defaultPeriodReadonly == defaultPeriodReadonly &&
    other.defaultPeriodAutocommit == defaultPeriodAutocommit &&
    other.poolPeriodSize == poolPeriodSize &&
    other.poolPeriodMaxPeriodWaitPeriodMsec == poolPeriodMaxPeriodWaitPeriodMsec &&
    other.datasourcePeriodName == datasourcePeriodName &&
    other.datasourcePeriodSvcPeriodProperties == datasourcePeriodSvcPeriodProperties;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (jdbcPeriodDriverPeriodClass == null ? 0 : jdbcPeriodDriverPeriodClass!.hashCode) +
    (jdbcPeriodConnectionPeriodUri == null ? 0 : jdbcPeriodConnectionPeriodUri!.hashCode) +
    (jdbcPeriodUsername == null ? 0 : jdbcPeriodUsername!.hashCode) +
    (jdbcPeriodPassword == null ? 0 : jdbcPeriodPassword!.hashCode) +
    (jdbcPeriodValidationPeriodQuery == null ? 0 : jdbcPeriodValidationPeriodQuery!.hashCode) +
    (defaultPeriodReadonly == null ? 0 : defaultPeriodReadonly!.hashCode) +
    (defaultPeriodAutocommit == null ? 0 : defaultPeriodAutocommit!.hashCode) +
    (poolPeriodSize == null ? 0 : poolPeriodSize!.hashCode) +
    (poolPeriodMaxPeriodWaitPeriodMsec == null ? 0 : poolPeriodMaxPeriodWaitPeriodMsec!.hashCode) +
    (datasourcePeriodName == null ? 0 : datasourcePeriodName!.hashCode) +
    (datasourcePeriodSvcPeriodProperties == null ? 0 : datasourcePeriodSvcPeriodProperties!.hashCode);

  @override
  String toString() => 'ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties[jdbcPeriodDriverPeriodClass=$jdbcPeriodDriverPeriodClass, jdbcPeriodConnectionPeriodUri=$jdbcPeriodConnectionPeriodUri, jdbcPeriodUsername=$jdbcPeriodUsername, jdbcPeriodPassword=$jdbcPeriodPassword, jdbcPeriodValidationPeriodQuery=$jdbcPeriodValidationPeriodQuery, defaultPeriodReadonly=$defaultPeriodReadonly, defaultPeriodAutocommit=$defaultPeriodAutocommit, poolPeriodSize=$poolPeriodSize, poolPeriodMaxPeriodWaitPeriodMsec=$poolPeriodMaxPeriodWaitPeriodMsec, datasourcePeriodName=$datasourcePeriodName, datasourcePeriodSvcPeriodProperties=$datasourcePeriodSvcPeriodProperties]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.jdbcPeriodDriverPeriodClass != null) {
      json[r'jdbc.driver.class'] = this.jdbcPeriodDriverPeriodClass;
    } else {
      json[r'jdbc.driver.class'] = null;
    }
    if (this.jdbcPeriodConnectionPeriodUri != null) {
      json[r'jdbc.connection.uri'] = this.jdbcPeriodConnectionPeriodUri;
    } else {
      json[r'jdbc.connection.uri'] = null;
    }
    if (this.jdbcPeriodUsername != null) {
      json[r'jdbc.username'] = this.jdbcPeriodUsername;
    } else {
      json[r'jdbc.username'] = null;
    }
    if (this.jdbcPeriodPassword != null) {
      json[r'jdbc.password'] = this.jdbcPeriodPassword;
    } else {
      json[r'jdbc.password'] = null;
    }
    if (this.jdbcPeriodValidationPeriodQuery != null) {
      json[r'jdbc.validation.query'] = this.jdbcPeriodValidationPeriodQuery;
    } else {
      json[r'jdbc.validation.query'] = null;
    }
    if (this.defaultPeriodReadonly != null) {
      json[r'default.readonly'] = this.defaultPeriodReadonly;
    } else {
      json[r'default.readonly'] = null;
    }
    if (this.defaultPeriodAutocommit != null) {
      json[r'default.autocommit'] = this.defaultPeriodAutocommit;
    } else {
      json[r'default.autocommit'] = null;
    }
    if (this.poolPeriodSize != null) {
      json[r'pool.size'] = this.poolPeriodSize;
    } else {
      json[r'pool.size'] = null;
    }
    if (this.poolPeriodMaxPeriodWaitPeriodMsec != null) {
      json[r'pool.max.wait.msec'] = this.poolPeriodMaxPeriodWaitPeriodMsec;
    } else {
      json[r'pool.max.wait.msec'] = null;
    }
    if (this.datasourcePeriodName != null) {
      json[r'datasource.name'] = this.datasourcePeriodName;
    } else {
      json[r'datasource.name'] = null;
    }
    if (this.datasourcePeriodSvcPeriodProperties != null) {
      json[r'datasource.svc.properties'] = this.datasourcePeriodSvcPeriodProperties;
    } else {
      json[r'datasource.svc.properties'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties(
        jdbcPeriodDriverPeriodClass: ConfigNodePropertyString.fromJson(json[r'jdbc.driver.class']),
        jdbcPeriodConnectionPeriodUri: ConfigNodePropertyString.fromJson(json[r'jdbc.connection.uri']),
        jdbcPeriodUsername: ConfigNodePropertyString.fromJson(json[r'jdbc.username']),
        jdbcPeriodPassword: ConfigNodePropertyString.fromJson(json[r'jdbc.password']),
        jdbcPeriodValidationPeriodQuery: ConfigNodePropertyString.fromJson(json[r'jdbc.validation.query']),
        defaultPeriodReadonly: ConfigNodePropertyBoolean.fromJson(json[r'default.readonly']),
        defaultPeriodAutocommit: ConfigNodePropertyBoolean.fromJson(json[r'default.autocommit']),
        poolPeriodSize: ConfigNodePropertyInteger.fromJson(json[r'pool.size']),
        poolPeriodMaxPeriodWaitPeriodMsec: ConfigNodePropertyInteger.fromJson(json[r'pool.max.wait.msec']),
        datasourcePeriodName: ConfigNodePropertyString.fromJson(json[r'datasource.name']),
        datasourcePeriodSvcPeriodProperties: ConfigNodePropertyArray.fromJson(json[r'datasource.svc.properties']),
      );
    }
    return null;
  }

  static List<ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties-objects as value to a dart map
  static Map<String, List<ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

