//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties {
  /// Returns a new [ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties] instance.
  ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties({
    this.reportPeriodFetchPeriodDelay,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? reportPeriodFetchPeriodDelay;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties &&
    other.reportPeriodFetchPeriodDelay == reportPeriodFetchPeriodDelay;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (reportPeriodFetchPeriodDelay == null ? 0 : reportPeriodFetchPeriodDelay!.hashCode);

  @override
  String toString() => 'ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties[reportPeriodFetchPeriodDelay=$reportPeriodFetchPeriodDelay]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.reportPeriodFetchPeriodDelay != null) {
      json[r'report.fetch.delay'] = this.reportPeriodFetchPeriodDelay;
    } else {
      json[r'report.fetch.delay'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties(
        reportPeriodFetchPeriodDelay: ConfigNodePropertyInteger.fromJson(json[r'report.fetch.delay']),
      );
    }
    return null;
  }

  static List<ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

