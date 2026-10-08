//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqPollingImporterImplManagedPollConfigImplProperties {
  /// Returns a new [ComDayCqPollingImporterImplManagedPollConfigImplProperties] instance.
  ComDayCqPollingImporterImplManagedPollConfigImplProperties({
    this.id,
    this.enabled,
    this.reference,
    this.interval,
    this.expression,
    this.source_,
    this.target,
    this.login,
    this.password,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? id;

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
  ConfigNodePropertyBoolean? reference;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? interval;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? expression;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? source_;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? target;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? login;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? password;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqPollingImporterImplManagedPollConfigImplProperties &&
    other.id == id &&
    other.enabled == enabled &&
    other.reference == reference &&
    other.interval == interval &&
    other.expression == expression &&
    other.source_ == source_ &&
    other.target == target &&
    other.login == login &&
    other.password == password;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id == null ? 0 : id!.hashCode) +
    (enabled == null ? 0 : enabled!.hashCode) +
    (reference == null ? 0 : reference!.hashCode) +
    (interval == null ? 0 : interval!.hashCode) +
    (expression == null ? 0 : expression!.hashCode) +
    (source_ == null ? 0 : source_!.hashCode) +
    (target == null ? 0 : target!.hashCode) +
    (login == null ? 0 : login!.hashCode) +
    (password == null ? 0 : password!.hashCode);

  @override
  String toString() => 'ComDayCqPollingImporterImplManagedPollConfigImplProperties[id=$id, enabled=$enabled, reference=$reference, interval=$interval, expression=$expression, source_=$source_, target=$target, login=$login, password=$password]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.enabled != null) {
      json[r'enabled'] = this.enabled;
    } else {
      json[r'enabled'] = null;
    }
    if (this.reference != null) {
      json[r'reference'] = this.reference;
    } else {
      json[r'reference'] = null;
    }
    if (this.interval != null) {
      json[r'interval'] = this.interval;
    } else {
      json[r'interval'] = null;
    }
    if (this.expression != null) {
      json[r'expression'] = this.expression;
    } else {
      json[r'expression'] = null;
    }
    if (this.source_ != null) {
      json[r'source'] = this.source_;
    } else {
      json[r'source'] = null;
    }
    if (this.target != null) {
      json[r'target'] = this.target;
    } else {
      json[r'target'] = null;
    }
    if (this.login != null) {
      json[r'login'] = this.login;
    } else {
      json[r'login'] = null;
    }
    if (this.password != null) {
      json[r'password'] = this.password;
    } else {
      json[r'password'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqPollingImporterImplManagedPollConfigImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqPollingImporterImplManagedPollConfigImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqPollingImporterImplManagedPollConfigImplProperties(
        id: ConfigNodePropertyString.fromJson(json[r'id']),
        enabled: ConfigNodePropertyBoolean.fromJson(json[r'enabled']),
        reference: ConfigNodePropertyBoolean.fromJson(json[r'reference']),
        interval: ConfigNodePropertyInteger.fromJson(json[r'interval']),
        expression: ConfigNodePropertyString.fromJson(json[r'expression']),
        source_: ConfigNodePropertyString.fromJson(json[r'source']),
        target: ConfigNodePropertyString.fromJson(json[r'target']),
        login: ConfigNodePropertyString.fromJson(json[r'login']),
        password: ConfigNodePropertyString.fromJson(json[r'password']),
      );
    }
    return null;
  }

  static List<ComDayCqPollingImporterImplManagedPollConfigImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqPollingImporterImplManagedPollConfigImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqPollingImporterImplManagedPollConfigImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqPollingImporterImplManagedPollConfigImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqPollingImporterImplManagedPollConfigImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqPollingImporterImplManagedPollConfigImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqPollingImporterImplManagedPollConfigImplProperties-objects as value to a dart map
  static Map<String, List<ComDayCqPollingImporterImplManagedPollConfigImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqPollingImporterImplManagedPollConfigImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqPollingImporterImplManagedPollConfigImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

