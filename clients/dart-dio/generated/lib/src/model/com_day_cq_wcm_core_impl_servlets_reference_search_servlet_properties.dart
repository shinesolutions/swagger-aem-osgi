//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties.g.dart';

/// ComDayCqWcmCoreImplServletsReferenceSearchServletProperties
///
/// Properties:
/// * [referencesearchservletPeriodMaxReferencesPerPage] 
/// * [referencesearchservletPeriodMaxPages] 
@BuiltValue()
abstract class ComDayCqWcmCoreImplServletsReferenceSearchServletProperties implements Built<ComDayCqWcmCoreImplServletsReferenceSearchServletProperties, ComDayCqWcmCoreImplServletsReferenceSearchServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'referencesearchservlet.maxReferencesPerPage')
  ConfigNodePropertyInteger? get referencesearchservletPeriodMaxReferencesPerPage;

  @BuiltValueField(wireName: r'referencesearchservlet.maxPages')
  ConfigNodePropertyInteger? get referencesearchservletPeriodMaxPages;

  ComDayCqWcmCoreImplServletsReferenceSearchServletProperties._();

  factory ComDayCqWcmCoreImplServletsReferenceSearchServletProperties([void updates(ComDayCqWcmCoreImplServletsReferenceSearchServletPropertiesBuilder b)]) = _$ComDayCqWcmCoreImplServletsReferenceSearchServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmCoreImplServletsReferenceSearchServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmCoreImplServletsReferenceSearchServletProperties> get serializer => _$ComDayCqWcmCoreImplServletsReferenceSearchServletPropertiesSerializer();
}

class _$ComDayCqWcmCoreImplServletsReferenceSearchServletPropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmCoreImplServletsReferenceSearchServletProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmCoreImplServletsReferenceSearchServletProperties, _$ComDayCqWcmCoreImplServletsReferenceSearchServletProperties];

  @override
  final String wireName = r'ComDayCqWcmCoreImplServletsReferenceSearchServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmCoreImplServletsReferenceSearchServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.referencesearchservletPeriodMaxReferencesPerPage != null) {
      yield r'referencesearchservlet.maxReferencesPerPage';
      yield serializers.serialize(
        object.referencesearchservletPeriodMaxReferencesPerPage,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.referencesearchservletPeriodMaxPages != null) {
      yield r'referencesearchservlet.maxPages';
      yield serializers.serialize(
        object.referencesearchservletPeriodMaxPages,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmCoreImplServletsReferenceSearchServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmCoreImplServletsReferenceSearchServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'referencesearchservlet.maxReferencesPerPage':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.referencesearchservletPeriodMaxReferencesPerPage.replace(valueDes);
          break;
        case r'referencesearchservlet.maxPages':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.referencesearchservletPeriodMaxPages.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmCoreImplServletsReferenceSearchServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmCoreImplServletsReferenceSearchServletPropertiesBuilder();
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

