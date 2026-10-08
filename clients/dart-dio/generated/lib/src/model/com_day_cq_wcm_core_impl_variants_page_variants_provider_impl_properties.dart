//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_core_impl_variants_page_variants_provider_impl_properties.g.dart';

/// ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties
///
/// Properties:
/// * [defaultPeriodExternalizerPeriodDomain] 
@BuiltValue()
abstract class ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties implements Built<ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties, ComDayCqWcmCoreImplVariantsPageVariantsProviderImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'default.externalizer.domain')
  ConfigNodePropertyString? get defaultPeriodExternalizerPeriodDomain;

  ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties._();

  factory ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties([void updates(ComDayCqWcmCoreImplVariantsPageVariantsProviderImplPropertiesBuilder b)]) = _$ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmCoreImplVariantsPageVariantsProviderImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties> get serializer => _$ComDayCqWcmCoreImplVariantsPageVariantsProviderImplPropertiesSerializer();
}

class _$ComDayCqWcmCoreImplVariantsPageVariantsProviderImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties, _$ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties];

  @override
  final String wireName = r'ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.defaultPeriodExternalizerPeriodDomain != null) {
      yield r'default.externalizer.domain';
      yield serializers.serialize(
        object.defaultPeriodExternalizerPeriodDomain,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmCoreImplVariantsPageVariantsProviderImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'default.externalizer.domain':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.defaultPeriodExternalizerPeriodDomain.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmCoreImplVariantsPageVariantsProviderImplPropertiesBuilder();
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

