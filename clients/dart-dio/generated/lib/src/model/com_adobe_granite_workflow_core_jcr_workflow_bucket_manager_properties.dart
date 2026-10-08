//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_properties.g.dart';

/// ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties
///
/// Properties:
/// * [bucketSize] 
@BuiltValue()
abstract class ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties implements Built<ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties, ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerPropertiesBuilder> {
  @BuiltValueField(wireName: r'bucketSize')
  ConfigNodePropertyInteger? get bucketSize;

  ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties._();

  factory ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties([void updates(ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerPropertiesBuilder b)]) = _$ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties> get serializer => _$ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerPropertiesSerializer();
}

class _$ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties, _$ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties];

  @override
  final String wireName = r'ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.bucketSize != null) {
      yield r'bucketSize';
      yield serializers.serialize(
        object.bucketSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'bucketSize':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.bucketSize.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerPropertiesBuilder();
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

