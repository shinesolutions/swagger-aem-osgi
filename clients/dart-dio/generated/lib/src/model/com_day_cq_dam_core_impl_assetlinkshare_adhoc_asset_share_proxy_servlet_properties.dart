//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_core_impl_assetlinkshare_adhoc_asset_share_proxy_servlet_properties.g.dart';

/// ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties
///
/// Properties:
/// * [cqPeriodDamPeriodAdhocPeriodAssetPeriodSharePeriodPrezipPeriodMaxcontentsize] 
@BuiltValue()
abstract class ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties implements Built<ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties, ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'cq.dam.adhoc.asset.share.prezip.maxcontentsize')
  ConfigNodePropertyInteger? get cqPeriodDamPeriodAdhocPeriodAssetPeriodSharePeriodPrezipPeriodMaxcontentsize;

  ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties._();

  factory ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties([void updates(ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletPropertiesBuilder b)]) = _$ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties> get serializer => _$ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletPropertiesSerializer();
}

class _$ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties, _$ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties];

  @override
  final String wireName = r'ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cqPeriodDamPeriodAdhocPeriodAssetPeriodSharePeriodPrezipPeriodMaxcontentsize != null) {
      yield r'cq.dam.adhoc.asset.share.prezip.maxcontentsize';
      yield serializers.serialize(
        object.cqPeriodDamPeriodAdhocPeriodAssetPeriodSharePeriodPrezipPeriodMaxcontentsize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cq.dam.adhoc.asset.share.prezip.maxcontentsize':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.cqPeriodDamPeriodAdhocPeriodAssetPeriodSharePeriodPrezipPeriodMaxcontentsize.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletPropertiesBuilder();
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

