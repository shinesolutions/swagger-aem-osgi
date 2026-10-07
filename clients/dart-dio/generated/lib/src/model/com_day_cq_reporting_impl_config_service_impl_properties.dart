//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_reporting_impl_config_service_impl_properties.g.dart';

/// ComDayCqReportingImplConfigServiceImplProperties
///
/// Properties:
/// * [repconfPeriodTimezone] 
/// * [repconfPeriodLocale] 
/// * [repconfPeriodSnapshots] 
/// * [repconfPeriodRepdir] 
/// * [repconfPeriodHourofday] 
/// * [repconfPeriodMinofhour] 
/// * [repconfPeriodMaxrows] 
/// * [repconfPeriodFakedata] 
/// * [repconfPeriodSnapshotuser] 
/// * [repconfPeriodEnforcesnapshotuser] 
@BuiltValue()
abstract class ComDayCqReportingImplConfigServiceImplProperties implements Built<ComDayCqReportingImplConfigServiceImplProperties, ComDayCqReportingImplConfigServiceImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'repconf.timezone')
  ConfigNodePropertyString? get repconfPeriodTimezone;

  @BuiltValueField(wireName: r'repconf.locale')
  ConfigNodePropertyString? get repconfPeriodLocale;

  @BuiltValueField(wireName: r'repconf.snapshots')
  ConfigNodePropertyString? get repconfPeriodSnapshots;

  @BuiltValueField(wireName: r'repconf.repdir')
  ConfigNodePropertyString? get repconfPeriodRepdir;

  @BuiltValueField(wireName: r'repconf.hourofday')
  ConfigNodePropertyInteger? get repconfPeriodHourofday;

  @BuiltValueField(wireName: r'repconf.minofhour')
  ConfigNodePropertyInteger? get repconfPeriodMinofhour;

  @BuiltValueField(wireName: r'repconf.maxrows')
  ConfigNodePropertyInteger? get repconfPeriodMaxrows;

  @BuiltValueField(wireName: r'repconf.fakedata')
  ConfigNodePropertyBoolean? get repconfPeriodFakedata;

  @BuiltValueField(wireName: r'repconf.snapshotuser')
  ConfigNodePropertyString? get repconfPeriodSnapshotuser;

  @BuiltValueField(wireName: r'repconf.enforcesnapshotuser')
  ConfigNodePropertyBoolean? get repconfPeriodEnforcesnapshotuser;

  ComDayCqReportingImplConfigServiceImplProperties._();

  factory ComDayCqReportingImplConfigServiceImplProperties([void updates(ComDayCqReportingImplConfigServiceImplPropertiesBuilder b)]) = _$ComDayCqReportingImplConfigServiceImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqReportingImplConfigServiceImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqReportingImplConfigServiceImplProperties> get serializer => _$ComDayCqReportingImplConfigServiceImplPropertiesSerializer();
}

class _$ComDayCqReportingImplConfigServiceImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqReportingImplConfigServiceImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqReportingImplConfigServiceImplProperties, _$ComDayCqReportingImplConfigServiceImplProperties];

  @override
  final String wireName = r'ComDayCqReportingImplConfigServiceImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqReportingImplConfigServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.repconfPeriodTimezone != null) {
      yield r'repconf.timezone';
      yield serializers.serialize(
        object.repconfPeriodTimezone,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.repconfPeriodLocale != null) {
      yield r'repconf.locale';
      yield serializers.serialize(
        object.repconfPeriodLocale,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.repconfPeriodSnapshots != null) {
      yield r'repconf.snapshots';
      yield serializers.serialize(
        object.repconfPeriodSnapshots,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.repconfPeriodRepdir != null) {
      yield r'repconf.repdir';
      yield serializers.serialize(
        object.repconfPeriodRepdir,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.repconfPeriodHourofday != null) {
      yield r'repconf.hourofday';
      yield serializers.serialize(
        object.repconfPeriodHourofday,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.repconfPeriodMinofhour != null) {
      yield r'repconf.minofhour';
      yield serializers.serialize(
        object.repconfPeriodMinofhour,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.repconfPeriodMaxrows != null) {
      yield r'repconf.maxrows';
      yield serializers.serialize(
        object.repconfPeriodMaxrows,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.repconfPeriodFakedata != null) {
      yield r'repconf.fakedata';
      yield serializers.serialize(
        object.repconfPeriodFakedata,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.repconfPeriodSnapshotuser != null) {
      yield r'repconf.snapshotuser';
      yield serializers.serialize(
        object.repconfPeriodSnapshotuser,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.repconfPeriodEnforcesnapshotuser != null) {
      yield r'repconf.enforcesnapshotuser';
      yield serializers.serialize(
        object.repconfPeriodEnforcesnapshotuser,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqReportingImplConfigServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqReportingImplConfigServiceImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'repconf.timezone':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.repconfPeriodTimezone.replace(valueDes);
          break;
        case r'repconf.locale':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.repconfPeriodLocale.replace(valueDes);
          break;
        case r'repconf.snapshots':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.repconfPeriodSnapshots.replace(valueDes);
          break;
        case r'repconf.repdir':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.repconfPeriodRepdir.replace(valueDes);
          break;
        case r'repconf.hourofday':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.repconfPeriodHourofday.replace(valueDes);
          break;
        case r'repconf.minofhour':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.repconfPeriodMinofhour.replace(valueDes);
          break;
        case r'repconf.maxrows':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.repconfPeriodMaxrows.replace(valueDes);
          break;
        case r'repconf.fakedata':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.repconfPeriodFakedata.replace(valueDes);
          break;
        case r'repconf.snapshotuser':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.repconfPeriodSnapshotuser.replace(valueDes);
          break;
        case r'repconf.enforcesnapshotuser':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.repconfPeriodEnforcesnapshotuser.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqReportingImplConfigServiceImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqReportingImplConfigServiceImplPropertiesBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

