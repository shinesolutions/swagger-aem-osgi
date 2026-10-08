//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_scene7_impl_scene7_configuration_event_listener_properties.g.dart';

/// ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties
///
/// Properties:
/// * [cqPeriodDamPeriodScene7PeriodConfigurationeventlistenerPeriodEnabled] 
@BuiltValue()
abstract class ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties implements Built<ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties, ComDayCqDamScene7ImplScene7ConfigurationEventListenerPropertiesBuilder> {
  @BuiltValueField(wireName: r'cq.dam.scene7.configurationeventlistener.enabled')
  ConfigNodePropertyBoolean? get cqPeriodDamPeriodScene7PeriodConfigurationeventlistenerPeriodEnabled;

  ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties._();

  factory ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties([void updates(ComDayCqDamScene7ImplScene7ConfigurationEventListenerPropertiesBuilder b)]) = _$ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamScene7ImplScene7ConfigurationEventListenerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties> get serializer => _$ComDayCqDamScene7ImplScene7ConfigurationEventListenerPropertiesSerializer();
}

class _$ComDayCqDamScene7ImplScene7ConfigurationEventListenerPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties, _$ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties];

  @override
  final String wireName = r'ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cqPeriodDamPeriodScene7PeriodConfigurationeventlistenerPeriodEnabled != null) {
      yield r'cq.dam.scene7.configurationeventlistener.enabled';
      yield serializers.serialize(
        object.cqPeriodDamPeriodScene7PeriodConfigurationeventlistenerPeriodEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamScene7ImplScene7ConfigurationEventListenerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cq.dam.scene7.configurationeventlistener.enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.cqPeriodDamPeriodScene7PeriodConfigurationeventlistenerPeriodEnabled.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamScene7ImplScene7ConfigurationEventListenerPropertiesBuilder();
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

