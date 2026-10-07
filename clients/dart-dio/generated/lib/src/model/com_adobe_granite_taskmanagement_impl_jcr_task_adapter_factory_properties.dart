//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_properties.g.dart';

/// ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties
///
/// Properties:
/// * [adapterPeriodCondition] 
@BuiltValue()
abstract class ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties implements Built<ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties, ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryPropertiesBuilder> {
  @BuiltValueField(wireName: r'adapter.condition')
  ConfigNodePropertyString? get adapterPeriodCondition;

  ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties._();

  factory ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties([void updates(ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryPropertiesBuilder b)]) = _$ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties> get serializer => _$ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryPropertiesSerializer();
}

class _$ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties, _$ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties];

  @override
  final String wireName = r'ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.adapterPeriodCondition != null) {
      yield r'adapter.condition';
      yield serializers.serialize(
        object.adapterPeriodCondition,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'adapter.condition':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.adapterPeriodCondition.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryPropertiesBuilder();
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

