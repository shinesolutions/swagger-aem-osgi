//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties.g.dart';

/// ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties
///
/// Properties:
/// * [xmpPeriodFilterPeriodApplyWhitelist] 
/// * [xmpPeriodFilterPeriodWhitelist] 
/// * [xmpPeriodFilterPeriodApplyBlacklist] 
/// * [xmpPeriodFilterPeriodBlacklist] 
@BuiltValue()
abstract class ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties implements Built<ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties, ComDayCqDamCommonsMetadataXmpFilterBlackWhitePropertiesBuilder> {
  @BuiltValueField(wireName: r'xmp.filter.apply_whitelist')
  ConfigNodePropertyBoolean? get xmpPeriodFilterPeriodApplyWhitelist;

  @BuiltValueField(wireName: r'xmp.filter.whitelist')
  ConfigNodePropertyArray? get xmpPeriodFilterPeriodWhitelist;

  @BuiltValueField(wireName: r'xmp.filter.apply_blacklist')
  ConfigNodePropertyBoolean? get xmpPeriodFilterPeriodApplyBlacklist;

  @BuiltValueField(wireName: r'xmp.filter.blacklist')
  ConfigNodePropertyArray? get xmpPeriodFilterPeriodBlacklist;

  ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties._();

  factory ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties([void updates(ComDayCqDamCommonsMetadataXmpFilterBlackWhitePropertiesBuilder b)]) = _$ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamCommonsMetadataXmpFilterBlackWhitePropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties> get serializer => _$ComDayCqDamCommonsMetadataXmpFilterBlackWhitePropertiesSerializer();
}

class _$ComDayCqDamCommonsMetadataXmpFilterBlackWhitePropertiesSerializer implements PrimitiveSerializer<ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties, _$ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties];

  @override
  final String wireName = r'ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.xmpPeriodFilterPeriodApplyWhitelist != null) {
      yield r'xmp.filter.apply_whitelist';
      yield serializers.serialize(
        object.xmpPeriodFilterPeriodApplyWhitelist,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.xmpPeriodFilterPeriodWhitelist != null) {
      yield r'xmp.filter.whitelist';
      yield serializers.serialize(
        object.xmpPeriodFilterPeriodWhitelist,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.xmpPeriodFilterPeriodApplyBlacklist != null) {
      yield r'xmp.filter.apply_blacklist';
      yield serializers.serialize(
        object.xmpPeriodFilterPeriodApplyBlacklist,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.xmpPeriodFilterPeriodBlacklist != null) {
      yield r'xmp.filter.blacklist';
      yield serializers.serialize(
        object.xmpPeriodFilterPeriodBlacklist,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamCommonsMetadataXmpFilterBlackWhitePropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'xmp.filter.apply_whitelist':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.xmpPeriodFilterPeriodApplyWhitelist.replace(valueDes);
          break;
        case r'xmp.filter.whitelist':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.xmpPeriodFilterPeriodWhitelist.replace(valueDes);
          break;
        case r'xmp.filter.apply_blacklist':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.xmpPeriodFilterPeriodApplyBlacklist.replace(valueDes);
          break;
        case r'xmp.filter.blacklist':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.xmpPeriodFilterPeriodBlacklist.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamCommonsMetadataXmpFilterBlackWhitePropertiesBuilder();
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

