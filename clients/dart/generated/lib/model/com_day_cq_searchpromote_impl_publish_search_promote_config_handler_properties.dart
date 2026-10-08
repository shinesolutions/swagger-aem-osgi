//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties {
  /// Returns a new [ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties] instance.
  ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties({
    this.cqPeriodSearchpromotePeriodConfighandlerPeriodEnabled,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? cqPeriodSearchpromotePeriodConfighandlerPeriodEnabled;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties &&
    other.cqPeriodSearchpromotePeriodConfighandlerPeriodEnabled == cqPeriodSearchpromotePeriodConfighandlerPeriodEnabled;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (cqPeriodSearchpromotePeriodConfighandlerPeriodEnabled == null ? 0 : cqPeriodSearchpromotePeriodConfighandlerPeriodEnabled!.hashCode);

  @override
  String toString() => 'ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties[cqPeriodSearchpromotePeriodConfighandlerPeriodEnabled=$cqPeriodSearchpromotePeriodConfighandlerPeriodEnabled]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.cqPeriodSearchpromotePeriodConfighandlerPeriodEnabled != null) {
      json[r'cq.searchpromote.confighandler.enabled'] = this.cqPeriodSearchpromotePeriodConfighandlerPeriodEnabled;
    } else {
      json[r'cq.searchpromote.confighandler.enabled'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties(
        cqPeriodSearchpromotePeriodConfighandlerPeriodEnabled: ConfigNodePropertyBoolean.fromJson(json[r'cq.searchpromote.confighandler.enabled']),
      );
    }
    return null;
  }

  static List<ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties-objects as value to a dart map
  static Map<String, List<ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

