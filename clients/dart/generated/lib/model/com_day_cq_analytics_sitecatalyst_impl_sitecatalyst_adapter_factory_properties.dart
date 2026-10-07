//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties {
  /// Returns a new [ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties] instance.
  ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties({
    this.cqPeriodAnalyticsPeriodAdapterfactoryPeriodContextstores,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? cqPeriodAnalyticsPeriodAdapterfactoryPeriodContextstores;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties &&
    other.cqPeriodAnalyticsPeriodAdapterfactoryPeriodContextstores == cqPeriodAnalyticsPeriodAdapterfactoryPeriodContextstores;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (cqPeriodAnalyticsPeriodAdapterfactoryPeriodContextstores == null ? 0 : cqPeriodAnalyticsPeriodAdapterfactoryPeriodContextstores!.hashCode);

  @override
  String toString() => 'ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties[cqPeriodAnalyticsPeriodAdapterfactoryPeriodContextstores=$cqPeriodAnalyticsPeriodAdapterfactoryPeriodContextstores]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.cqPeriodAnalyticsPeriodAdapterfactoryPeriodContextstores != null) {
      json[r'cq.analytics.adapterfactory.contextstores'] = this.cqPeriodAnalyticsPeriodAdapterfactoryPeriodContextstores;
    } else {
      json[r'cq.analytics.adapterfactory.contextstores'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties(
        cqPeriodAnalyticsPeriodAdapterfactoryPeriodContextstores: ConfigNodePropertyArray.fromJson(json[r'cq.analytics.adapterfactory.contextstores']),
      );
    }
    return null;
  }

  static List<ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties-objects as value to a dart map
  static Map<String, List<ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

