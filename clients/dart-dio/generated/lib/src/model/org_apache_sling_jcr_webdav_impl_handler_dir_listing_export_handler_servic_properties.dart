//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties.g.dart';

/// OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties
///
/// Properties:
/// * [servicePeriodRanking] 
@BuiltValue()
abstract class OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties implements Built<OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties, OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicPropertiesBuilder> {
  @BuiltValueField(wireName: r'service.ranking')
  ConfigNodePropertyInteger? get servicePeriodRanking;

  OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties._();

  factory OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties([void updates(OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicPropertiesBuilder b)]) = _$OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties> get serializer => _$OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicPropertiesSerializer();
}

class _$OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties, _$OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties];

  @override
  final String wireName = r'OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.servicePeriodRanking != null) {
      yield r'service.ranking';
      yield serializers.serialize(
        object.servicePeriodRanking,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicPropertiesBuilder result,
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
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicPropertiesBuilder();
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

