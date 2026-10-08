//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeGraniteLoggingImplLogAnalyserImplProperties {
  /// Returns a new [ComAdobeGraniteLoggingImplLogAnalyserImplProperties] instance.
  ComAdobeGraniteLoggingImplLogAnalyserImplProperties({
    this.messagesPeriodQueuePeriodSize,
    this.loggerPeriodConfig,
    this.messagesPeriodSize,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? messagesPeriodQueuePeriodSize;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? loggerPeriodConfig;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? messagesPeriodSize;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeGraniteLoggingImplLogAnalyserImplProperties &&
    other.messagesPeriodQueuePeriodSize == messagesPeriodQueuePeriodSize &&
    other.loggerPeriodConfig == loggerPeriodConfig &&
    other.messagesPeriodSize == messagesPeriodSize;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (messagesPeriodQueuePeriodSize == null ? 0 : messagesPeriodQueuePeriodSize!.hashCode) +
    (loggerPeriodConfig == null ? 0 : loggerPeriodConfig!.hashCode) +
    (messagesPeriodSize == null ? 0 : messagesPeriodSize!.hashCode);

  @override
  String toString() => 'ComAdobeGraniteLoggingImplLogAnalyserImplProperties[messagesPeriodQueuePeriodSize=$messagesPeriodQueuePeriodSize, loggerPeriodConfig=$loggerPeriodConfig, messagesPeriodSize=$messagesPeriodSize]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.messagesPeriodQueuePeriodSize != null) {
      json[r'messages.queue.size'] = this.messagesPeriodQueuePeriodSize;
    } else {
      json[r'messages.queue.size'] = null;
    }
    if (this.loggerPeriodConfig != null) {
      json[r'logger.config'] = this.loggerPeriodConfig;
    } else {
      json[r'logger.config'] = null;
    }
    if (this.messagesPeriodSize != null) {
      json[r'messages.size'] = this.messagesPeriodSize;
    } else {
      json[r'messages.size'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeGraniteLoggingImplLogAnalyserImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeGraniteLoggingImplLogAnalyserImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeGraniteLoggingImplLogAnalyserImplProperties(
        messagesPeriodQueuePeriodSize: ConfigNodePropertyInteger.fromJson(json[r'messages.queue.size']),
        loggerPeriodConfig: ConfigNodePropertyArray.fromJson(json[r'logger.config']),
        messagesPeriodSize: ConfigNodePropertyInteger.fromJson(json[r'messages.size']),
      );
    }
    return null;
  }

  static List<ComAdobeGraniteLoggingImplLogAnalyserImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeGraniteLoggingImplLogAnalyserImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeGraniteLoggingImplLogAnalyserImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeGraniteLoggingImplLogAnalyserImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeGraniteLoggingImplLogAnalyserImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeGraniteLoggingImplLogAnalyserImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeGraniteLoggingImplLogAnalyserImplProperties-objects as value to a dart map
  static Map<String, List<ComAdobeGraniteLoggingImplLogAnalyserImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeGraniteLoggingImplLogAnalyserImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeGraniteLoggingImplLogAnalyserImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

