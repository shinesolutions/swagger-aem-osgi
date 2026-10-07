//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_core_impl_process_text_extraction_process_properties.g.dart';

/// ComDayCqDamCoreImplProcessTextExtractionProcessProperties
///
/// Properties:
/// * [mimeTypes] 
/// * [maxExtract] 
@BuiltValue()
abstract class ComDayCqDamCoreImplProcessTextExtractionProcessProperties implements Built<ComDayCqDamCoreImplProcessTextExtractionProcessProperties, ComDayCqDamCoreImplProcessTextExtractionProcessPropertiesBuilder> {
  @BuiltValueField(wireName: r'mimeTypes')
  ConfigNodePropertyArray? get mimeTypes;

  @BuiltValueField(wireName: r'maxExtract')
  ConfigNodePropertyInteger? get maxExtract;

  ComDayCqDamCoreImplProcessTextExtractionProcessProperties._();

  factory ComDayCqDamCoreImplProcessTextExtractionProcessProperties([void updates(ComDayCqDamCoreImplProcessTextExtractionProcessPropertiesBuilder b)]) = _$ComDayCqDamCoreImplProcessTextExtractionProcessProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamCoreImplProcessTextExtractionProcessPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamCoreImplProcessTextExtractionProcessProperties> get serializer => _$ComDayCqDamCoreImplProcessTextExtractionProcessPropertiesSerializer();
}

class _$ComDayCqDamCoreImplProcessTextExtractionProcessPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamCoreImplProcessTextExtractionProcessProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamCoreImplProcessTextExtractionProcessProperties, _$ComDayCqDamCoreImplProcessTextExtractionProcessProperties];

  @override
  final String wireName = r'ComDayCqDamCoreImplProcessTextExtractionProcessProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamCoreImplProcessTextExtractionProcessProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.mimeTypes != null) {
      yield r'mimeTypes';
      yield serializers.serialize(
        object.mimeTypes,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.maxExtract != null) {
      yield r'maxExtract';
      yield serializers.serialize(
        object.maxExtract,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamCoreImplProcessTextExtractionProcessProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamCoreImplProcessTextExtractionProcessPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'mimeTypes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.mimeTypes.replace(valueDes);
          break;
        case r'maxExtract':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.maxExtract.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamCoreImplProcessTextExtractionProcessProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamCoreImplProcessTextExtractionProcessPropertiesBuilder();
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

