//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_core_impl_references_content_content_reference_config_properties.g.dart';

/// ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties
///
/// Properties:
/// * [contentReferenceConfigPeriodResourceTypes] 
@BuiltValue()
abstract class ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties implements Built<ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties, ComDayCqWcmCoreImplReferencesContentContentReferenceConfigPropertiesBuilder> {
  @BuiltValueField(wireName: r'contentReferenceConfig.resourceTypes')
  ConfigNodePropertyArray? get contentReferenceConfigPeriodResourceTypes;

  ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties._();

  factory ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties([void updates(ComDayCqWcmCoreImplReferencesContentContentReferenceConfigPropertiesBuilder b)]) = _$ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmCoreImplReferencesContentContentReferenceConfigPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties> get serializer => _$ComDayCqWcmCoreImplReferencesContentContentReferenceConfigPropertiesSerializer();
}

class _$ComDayCqWcmCoreImplReferencesContentContentReferenceConfigPropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties, _$ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties];

  @override
  final String wireName = r'ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.contentReferenceConfigPeriodResourceTypes != null) {
      yield r'contentReferenceConfig.resourceTypes';
      yield serializers.serialize(
        object.contentReferenceConfigPeriodResourceTypes,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmCoreImplReferencesContentContentReferenceConfigPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'contentReferenceConfig.resourceTypes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.contentReferenceConfigPeriodResourceTypes.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmCoreImplReferencesContentContentReferenceConfigPropertiesBuilder();
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

