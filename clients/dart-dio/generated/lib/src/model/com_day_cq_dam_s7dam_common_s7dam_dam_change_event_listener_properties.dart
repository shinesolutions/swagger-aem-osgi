//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_s7dam_common_s7dam_dam_change_event_listener_properties.g.dart';

/// ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties
///
/// Properties:
/// * [cqPeriodDamPeriodS7damPeriodDamchangeeventlistenerPeriodEnabled] 
@BuiltValue()
abstract class ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties implements Built<ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties, ComDayCqDamS7damCommonS7damDamChangeEventListenerPropertiesBuilder> {
  @BuiltValueField(wireName: r'cq.dam.s7dam.damchangeeventlistener.enabled')
  ConfigNodePropertyBoolean? get cqPeriodDamPeriodS7damPeriodDamchangeeventlistenerPeriodEnabled;

  ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties._();

  factory ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties([void updates(ComDayCqDamS7damCommonS7damDamChangeEventListenerPropertiesBuilder b)]) = _$ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamS7damCommonS7damDamChangeEventListenerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties> get serializer => _$ComDayCqDamS7damCommonS7damDamChangeEventListenerPropertiesSerializer();
}

class _$ComDayCqDamS7damCommonS7damDamChangeEventListenerPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties, _$ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties];

  @override
  final String wireName = r'ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cqPeriodDamPeriodS7damPeriodDamchangeeventlistenerPeriodEnabled != null) {
      yield r'cq.dam.s7dam.damchangeeventlistener.enabled';
      yield serializers.serialize(
        object.cqPeriodDamPeriodS7damPeriodDamchangeeventlistenerPeriodEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamS7damCommonS7damDamChangeEventListenerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cq.dam.s7dam.damchangeeventlistener.enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.cqPeriodDamPeriodS7damPeriodDamchangeeventlistenerPeriodEnabled.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamS7damCommonS7damDamChangeEventListenerPropertiesBuilder();
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

