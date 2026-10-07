//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqReportingImplRLogAnalyzerProperties {
  /// Returns a new [ComDayCqReportingImplRLogAnalyzerProperties] instance.
  ComDayCqReportingImplRLogAnalyzerProperties({
    this.requestPeriodLogPeriodOutput,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? requestPeriodLogPeriodOutput;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqReportingImplRLogAnalyzerProperties &&
    other.requestPeriodLogPeriodOutput == requestPeriodLogPeriodOutput;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (requestPeriodLogPeriodOutput == null ? 0 : requestPeriodLogPeriodOutput!.hashCode);

  @override
  String toString() => 'ComDayCqReportingImplRLogAnalyzerProperties[requestPeriodLogPeriodOutput=$requestPeriodLogPeriodOutput]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.requestPeriodLogPeriodOutput != null) {
      json[r'request.log.output'] = this.requestPeriodLogPeriodOutput;
    } else {
      json[r'request.log.output'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqReportingImplRLogAnalyzerProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqReportingImplRLogAnalyzerProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqReportingImplRLogAnalyzerProperties(
        requestPeriodLogPeriodOutput: ConfigNodePropertyString.fromJson(json[r'request.log.output']),
      );
    }
    return null;
  }

  static List<ComDayCqReportingImplRLogAnalyzerProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqReportingImplRLogAnalyzerProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqReportingImplRLogAnalyzerProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqReportingImplRLogAnalyzerProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqReportingImplRLogAnalyzerProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqReportingImplRLogAnalyzerProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqReportingImplRLogAnalyzerProperties-objects as value to a dart map
  static Map<String, List<ComDayCqReportingImplRLogAnalyzerProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqReportingImplRLogAnalyzerProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqReportingImplRLogAnalyzerProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

