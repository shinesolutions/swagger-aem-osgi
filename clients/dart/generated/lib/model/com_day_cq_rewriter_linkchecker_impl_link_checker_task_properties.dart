//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties {
  /// Returns a new [ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties] instance.
  ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties({
    this.schedulerPeriodPeriod,
    this.schedulerPeriodConcurrent,
    this.goodLinkTestInterval,
    this.badLinkTestInterval,
    this.linkUnusedInterval,
    this.connectionPeriodTimeout,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? schedulerPeriodPeriod;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? schedulerPeriodConcurrent;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? goodLinkTestInterval;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? badLinkTestInterval;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? linkUnusedInterval;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? connectionPeriodTimeout;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties &&
    other.schedulerPeriodPeriod == schedulerPeriodPeriod &&
    other.schedulerPeriodConcurrent == schedulerPeriodConcurrent &&
    other.goodLinkTestInterval == goodLinkTestInterval &&
    other.badLinkTestInterval == badLinkTestInterval &&
    other.linkUnusedInterval == linkUnusedInterval &&
    other.connectionPeriodTimeout == connectionPeriodTimeout;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (schedulerPeriodPeriod == null ? 0 : schedulerPeriodPeriod!.hashCode) +
    (schedulerPeriodConcurrent == null ? 0 : schedulerPeriodConcurrent!.hashCode) +
    (goodLinkTestInterval == null ? 0 : goodLinkTestInterval!.hashCode) +
    (badLinkTestInterval == null ? 0 : badLinkTestInterval!.hashCode) +
    (linkUnusedInterval == null ? 0 : linkUnusedInterval!.hashCode) +
    (connectionPeriodTimeout == null ? 0 : connectionPeriodTimeout!.hashCode);

  @override
  String toString() => 'ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties[schedulerPeriodPeriod=$schedulerPeriodPeriod, schedulerPeriodConcurrent=$schedulerPeriodConcurrent, goodLinkTestInterval=$goodLinkTestInterval, badLinkTestInterval=$badLinkTestInterval, linkUnusedInterval=$linkUnusedInterval, connectionPeriodTimeout=$connectionPeriodTimeout]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.schedulerPeriodPeriod != null) {
      json[r'scheduler.period'] = this.schedulerPeriodPeriod;
    } else {
      json[r'scheduler.period'] = null;
    }
    if (this.schedulerPeriodConcurrent != null) {
      json[r'scheduler.concurrent'] = this.schedulerPeriodConcurrent;
    } else {
      json[r'scheduler.concurrent'] = null;
    }
    if (this.goodLinkTestInterval != null) {
      json[r'good_link_test_interval'] = this.goodLinkTestInterval;
    } else {
      json[r'good_link_test_interval'] = null;
    }
    if (this.badLinkTestInterval != null) {
      json[r'bad_link_test_interval'] = this.badLinkTestInterval;
    } else {
      json[r'bad_link_test_interval'] = null;
    }
    if (this.linkUnusedInterval != null) {
      json[r'link_unused_interval'] = this.linkUnusedInterval;
    } else {
      json[r'link_unused_interval'] = null;
    }
    if (this.connectionPeriodTimeout != null) {
      json[r'connection.timeout'] = this.connectionPeriodTimeout;
    } else {
      json[r'connection.timeout'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties(
        schedulerPeriodPeriod: ConfigNodePropertyInteger.fromJson(json[r'scheduler.period']),
        schedulerPeriodConcurrent: ConfigNodePropertyBoolean.fromJson(json[r'scheduler.concurrent']),
        goodLinkTestInterval: ConfigNodePropertyInteger.fromJson(json[r'good_link_test_interval']),
        badLinkTestInterval: ConfigNodePropertyInteger.fromJson(json[r'bad_link_test_interval']),
        linkUnusedInterval: ConfigNodePropertyInteger.fromJson(json[r'link_unused_interval']),
        connectionPeriodTimeout: ConfigNodePropertyInteger.fromJson(json[r'connection.timeout']),
      );
    }
    return null;
  }

  static List<ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties-objects as value to a dart map
  static Map<String, List<ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

