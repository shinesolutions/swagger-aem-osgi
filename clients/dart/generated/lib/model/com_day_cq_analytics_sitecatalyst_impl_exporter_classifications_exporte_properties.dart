//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties {
  /// Returns a new [ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties] instance.
  ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties({
    this.allowedPeriodPaths,
    this.cqPeriodAnalyticsPeriodSaintPeriodExporterPeriodPagesize,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? allowedPeriodPaths;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? cqPeriodAnalyticsPeriodSaintPeriodExporterPeriodPagesize;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties &&
    other.allowedPeriodPaths == allowedPeriodPaths &&
    other.cqPeriodAnalyticsPeriodSaintPeriodExporterPeriodPagesize == cqPeriodAnalyticsPeriodSaintPeriodExporterPeriodPagesize;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (allowedPeriodPaths == null ? 0 : allowedPeriodPaths!.hashCode) +
    (cqPeriodAnalyticsPeriodSaintPeriodExporterPeriodPagesize == null ? 0 : cqPeriodAnalyticsPeriodSaintPeriodExporterPeriodPagesize!.hashCode);

  @override
  String toString() => 'ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties[allowedPeriodPaths=$allowedPeriodPaths, cqPeriodAnalyticsPeriodSaintPeriodExporterPeriodPagesize=$cqPeriodAnalyticsPeriodSaintPeriodExporterPeriodPagesize]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.allowedPeriodPaths != null) {
      json[r'allowed.paths'] = this.allowedPeriodPaths;
    } else {
      json[r'allowed.paths'] = null;
    }
    if (this.cqPeriodAnalyticsPeriodSaintPeriodExporterPeriodPagesize != null) {
      json[r'cq.analytics.saint.exporter.pagesize'] = this.cqPeriodAnalyticsPeriodSaintPeriodExporterPeriodPagesize;
    } else {
      json[r'cq.analytics.saint.exporter.pagesize'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties(
        allowedPeriodPaths: ConfigNodePropertyArray.fromJson(json[r'allowed.paths']),
        cqPeriodAnalyticsPeriodSaintPeriodExporterPeriodPagesize: ConfigNodePropertyInteger.fromJson(json[r'cq.analytics.saint.exporter.pagesize']),
      );
    }
    return null;
  }

  static List<ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties-objects as value to a dart map
  static Map<String, List<ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

