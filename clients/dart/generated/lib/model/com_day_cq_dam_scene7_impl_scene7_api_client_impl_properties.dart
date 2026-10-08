//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqDamScene7ImplScene7APIClientImplProperties {
  /// Returns a new [ComDayCqDamScene7ImplScene7APIClientImplProperties] instance.
  ComDayCqDamScene7ImplScene7APIClientImplProperties({
    this.cqPeriodDamPeriodScene7PeriodApiclientPeriodRecordsperpagePeriodNofilterPeriodName,
    this.cqPeriodDamPeriodScene7PeriodApiclientPeriodRecordsperpagePeriodWithfilterPeriodName,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? cqPeriodDamPeriodScene7PeriodApiclientPeriodRecordsperpagePeriodNofilterPeriodName;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? cqPeriodDamPeriodScene7PeriodApiclientPeriodRecordsperpagePeriodWithfilterPeriodName;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqDamScene7ImplScene7APIClientImplProperties &&
    other.cqPeriodDamPeriodScene7PeriodApiclientPeriodRecordsperpagePeriodNofilterPeriodName == cqPeriodDamPeriodScene7PeriodApiclientPeriodRecordsperpagePeriodNofilterPeriodName &&
    other.cqPeriodDamPeriodScene7PeriodApiclientPeriodRecordsperpagePeriodWithfilterPeriodName == cqPeriodDamPeriodScene7PeriodApiclientPeriodRecordsperpagePeriodWithfilterPeriodName;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (cqPeriodDamPeriodScene7PeriodApiclientPeriodRecordsperpagePeriodNofilterPeriodName == null ? 0 : cqPeriodDamPeriodScene7PeriodApiclientPeriodRecordsperpagePeriodNofilterPeriodName!.hashCode) +
    (cqPeriodDamPeriodScene7PeriodApiclientPeriodRecordsperpagePeriodWithfilterPeriodName == null ? 0 : cqPeriodDamPeriodScene7PeriodApiclientPeriodRecordsperpagePeriodWithfilterPeriodName!.hashCode);

  @override
  String toString() => 'ComDayCqDamScene7ImplScene7APIClientImplProperties[cqPeriodDamPeriodScene7PeriodApiclientPeriodRecordsperpagePeriodNofilterPeriodName=$cqPeriodDamPeriodScene7PeriodApiclientPeriodRecordsperpagePeriodNofilterPeriodName, cqPeriodDamPeriodScene7PeriodApiclientPeriodRecordsperpagePeriodWithfilterPeriodName=$cqPeriodDamPeriodScene7PeriodApiclientPeriodRecordsperpagePeriodWithfilterPeriodName]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.cqPeriodDamPeriodScene7PeriodApiclientPeriodRecordsperpagePeriodNofilterPeriodName != null) {
      json[r'cq.dam.scene7.apiclient.recordsperpage.nofilter.name'] = this.cqPeriodDamPeriodScene7PeriodApiclientPeriodRecordsperpagePeriodNofilterPeriodName;
    } else {
      json[r'cq.dam.scene7.apiclient.recordsperpage.nofilter.name'] = null;
    }
    if (this.cqPeriodDamPeriodScene7PeriodApiclientPeriodRecordsperpagePeriodWithfilterPeriodName != null) {
      json[r'cq.dam.scene7.apiclient.recordsperpage.withfilter.name'] = this.cqPeriodDamPeriodScene7PeriodApiclientPeriodRecordsperpagePeriodWithfilterPeriodName;
    } else {
      json[r'cq.dam.scene7.apiclient.recordsperpage.withfilter.name'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqDamScene7ImplScene7APIClientImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqDamScene7ImplScene7APIClientImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqDamScene7ImplScene7APIClientImplProperties(
        cqPeriodDamPeriodScene7PeriodApiclientPeriodRecordsperpagePeriodNofilterPeriodName: ConfigNodePropertyInteger.fromJson(json[r'cq.dam.scene7.apiclient.recordsperpage.nofilter.name']),
        cqPeriodDamPeriodScene7PeriodApiclientPeriodRecordsperpagePeriodWithfilterPeriodName: ConfigNodePropertyInteger.fromJson(json[r'cq.dam.scene7.apiclient.recordsperpage.withfilter.name']),
      );
    }
    return null;
  }

  static List<ComDayCqDamScene7ImplScene7APIClientImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqDamScene7ImplScene7APIClientImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqDamScene7ImplScene7APIClientImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqDamScene7ImplScene7APIClientImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqDamScene7ImplScene7APIClientImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqDamScene7ImplScene7APIClientImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqDamScene7ImplScene7APIClientImplProperties-objects as value to a dart map
  static Map<String, List<ComDayCqDamScene7ImplScene7APIClientImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqDamScene7ImplScene7APIClientImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqDamScene7ImplScene7APIClientImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

