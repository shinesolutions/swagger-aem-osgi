//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties.g.dart';

/// OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties
///
/// Properties:
/// * [servicePeriodRanking] 
/// * [typePeriodCollections] 
/// * [typePeriodNoncollections] 
/// * [typePeriodContent] 
@BuiltValue()
abstract class OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties implements Built<OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties, OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServicePropertiesBuilder> {
  @BuiltValueField(wireName: r'service.ranking')
  ConfigNodePropertyInteger? get servicePeriodRanking;

  @BuiltValueField(wireName: r'type.collections')
  ConfigNodePropertyString? get typePeriodCollections;

  @BuiltValueField(wireName: r'type.noncollections')
  ConfigNodePropertyString? get typePeriodNoncollections;

  @BuiltValueField(wireName: r'type.content')
  ConfigNodePropertyString? get typePeriodContent;

  OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties._();

  factory OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties([void updates(OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServicePropertiesBuilder b)]) = _$OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServicePropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties> get serializer => _$OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServicePropertiesSerializer();
}

class _$OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServicePropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties, _$OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties];

  @override
  final String wireName = r'OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.servicePeriodRanking != null) {
      yield r'service.ranking';
      yield serializers.serialize(
        object.servicePeriodRanking,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.typePeriodCollections != null) {
      yield r'type.collections';
      yield serializers.serialize(
        object.typePeriodCollections,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.typePeriodNoncollections != null) {
      yield r'type.noncollections';
      yield serializers.serialize(
        object.typePeriodNoncollections,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.typePeriodContent != null) {
      yield r'type.content';
      yield serializers.serialize(
        object.typePeriodContent,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServicePropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'service.ranking':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.servicePeriodRanking.replace(valueDes);
          break;
        case r'type.collections':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.typePeriodCollections.replace(valueDes);
          break;
        case r'type.noncollections':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.typePeriodNoncollections.replace(valueDes);
          break;
        case r'type.content':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.typePeriodContent.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServicePropertiesBuilder();
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

