//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_drop_down.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_felix_scr_scr_service_properties.g.dart';

/// OrgApacheFelixScrScrServiceProperties
///
/// Properties:
/// * [dsPeriodLoglevel] 
/// * [dsPeriodFactoryPeriodEnabled] 
/// * [dsPeriodDelayedPeriodKeepInstances] 
/// * [dsPeriodLockPeriodTimeoutPeriodMilliseconds] 
/// * [dsPeriodStopPeriodTimeoutPeriodMilliseconds] 
/// * [dsPeriodGlobalPeriodExtender] 
@BuiltValue()
abstract class OrgApacheFelixScrScrServiceProperties implements Built<OrgApacheFelixScrScrServiceProperties, OrgApacheFelixScrScrServicePropertiesBuilder> {
  @BuiltValueField(wireName: r'ds.loglevel')
  ConfigNodePropertyDropDown? get dsPeriodLoglevel;

  @BuiltValueField(wireName: r'ds.factory.enabled')
  ConfigNodePropertyBoolean? get dsPeriodFactoryPeriodEnabled;

  @BuiltValueField(wireName: r'ds.delayed.keepInstances')
  ConfigNodePropertyBoolean? get dsPeriodDelayedPeriodKeepInstances;

  @BuiltValueField(wireName: r'ds.lock.timeout.milliseconds')
  ConfigNodePropertyInteger? get dsPeriodLockPeriodTimeoutPeriodMilliseconds;

  @BuiltValueField(wireName: r'ds.stop.timeout.milliseconds')
  ConfigNodePropertyInteger? get dsPeriodStopPeriodTimeoutPeriodMilliseconds;

  @BuiltValueField(wireName: r'ds.global.extender')
  ConfigNodePropertyBoolean? get dsPeriodGlobalPeriodExtender;

  OrgApacheFelixScrScrServiceProperties._();

  factory OrgApacheFelixScrScrServiceProperties([void updates(OrgApacheFelixScrScrServicePropertiesBuilder b)]) = _$OrgApacheFelixScrScrServiceProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheFelixScrScrServicePropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheFelixScrScrServiceProperties> get serializer => _$OrgApacheFelixScrScrServicePropertiesSerializer();
}

class _$OrgApacheFelixScrScrServicePropertiesSerializer implements PrimitiveSerializer<OrgApacheFelixScrScrServiceProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheFelixScrScrServiceProperties, _$OrgApacheFelixScrScrServiceProperties];

  @override
  final String wireName = r'OrgApacheFelixScrScrServiceProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheFelixScrScrServiceProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.dsPeriodLoglevel != null) {
      yield r'ds.loglevel';
      yield serializers.serialize(
        object.dsPeriodLoglevel,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
    if (object.dsPeriodFactoryPeriodEnabled != null) {
      yield r'ds.factory.enabled';
      yield serializers.serialize(
        object.dsPeriodFactoryPeriodEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.dsPeriodDelayedPeriodKeepInstances != null) {
      yield r'ds.delayed.keepInstances';
      yield serializers.serialize(
        object.dsPeriodDelayedPeriodKeepInstances,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.dsPeriodLockPeriodTimeoutPeriodMilliseconds != null) {
      yield r'ds.lock.timeout.milliseconds';
      yield serializers.serialize(
        object.dsPeriodLockPeriodTimeoutPeriodMilliseconds,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.dsPeriodStopPeriodTimeoutPeriodMilliseconds != null) {
      yield r'ds.stop.timeout.milliseconds';
      yield serializers.serialize(
        object.dsPeriodStopPeriodTimeoutPeriodMilliseconds,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.dsPeriodGlobalPeriodExtender != null) {
      yield r'ds.global.extender';
      yield serializers.serialize(
        object.dsPeriodGlobalPeriodExtender,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheFelixScrScrServiceProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheFelixScrScrServicePropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'ds.loglevel':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.dsPeriodLoglevel.replace(valueDes);
          break;
        case r'ds.factory.enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.dsPeriodFactoryPeriodEnabled.replace(valueDes);
          break;
        case r'ds.delayed.keepInstances':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.dsPeriodDelayedPeriodKeepInstances.replace(valueDes);
          break;
        case r'ds.lock.timeout.milliseconds':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.dsPeriodLockPeriodTimeoutPeriodMilliseconds.replace(valueDes);
          break;
        case r'ds.stop.timeout.milliseconds':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.dsPeriodStopPeriodTimeoutPeriodMilliseconds.replace(valueDes);
          break;
        case r'ds.global.extender':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.dsPeriodGlobalPeriodExtender.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheFelixScrScrServiceProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheFelixScrScrServicePropertiesBuilder();
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

