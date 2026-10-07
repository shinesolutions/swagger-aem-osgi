//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_handler_properties.g.dart';

/// ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties
///
/// Properties:
/// * [damPeriodShowexpired] 
/// * [damPeriodShowhidden] 
/// * [tagTitleSearch] 
/// * [guessTotal] 
/// * [damPeriodExpiryProperty] 
@BuiltValue()
abstract class ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties implements Built<ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties, ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerPropertiesBuilder> {
  @BuiltValueField(wireName: r'dam.showexpired')
  ConfigNodePropertyBoolean? get damPeriodShowexpired;

  @BuiltValueField(wireName: r'dam.showhidden')
  ConfigNodePropertyBoolean? get damPeriodShowhidden;

  @BuiltValueField(wireName: r'tagTitleSearch')
  ConfigNodePropertyBoolean? get tagTitleSearch;

  @BuiltValueField(wireName: r'guessTotal')
  ConfigNodePropertyString? get guessTotal;

  @BuiltValueField(wireName: r'dam.expiryProperty')
  ConfigNodePropertyString? get damPeriodExpiryProperty;

  ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties._();

  factory ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties([void updates(ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerPropertiesBuilder b)]) = _$ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties> get serializer => _$ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerPropertiesSerializer();
}

class _$ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerPropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties, _$ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties];

  @override
  final String wireName = r'ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.damPeriodShowexpired != null) {
      yield r'dam.showexpired';
      yield serializers.serialize(
        object.damPeriodShowexpired,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.damPeriodShowhidden != null) {
      yield r'dam.showhidden';
      yield serializers.serialize(
        object.damPeriodShowhidden,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.tagTitleSearch != null) {
      yield r'tagTitleSearch';
      yield serializers.serialize(
        object.tagTitleSearch,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.guessTotal != null) {
      yield r'guessTotal';
      yield serializers.serialize(
        object.guessTotal,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.damPeriodExpiryProperty != null) {
      yield r'dam.expiryProperty';
      yield serializers.serialize(
        object.damPeriodExpiryProperty,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'dam.showexpired':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.damPeriodShowexpired.replace(valueDes);
          break;
        case r'dam.showhidden':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.damPeriodShowhidden.replace(valueDes);
          break;
        case r'tagTitleSearch':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.tagTitleSearch.replace(valueDes);
          break;
        case r'guessTotal':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.guessTotal.replace(valueDes);
          break;
        case r'dam.expiryProperty':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.damPeriodExpiryProperty.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerPropertiesBuilder();
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

