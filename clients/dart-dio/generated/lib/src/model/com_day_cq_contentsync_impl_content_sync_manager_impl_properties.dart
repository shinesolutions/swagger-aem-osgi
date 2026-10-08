//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_contentsync_impl_content_sync_manager_impl_properties.g.dart';

/// ComDayCqContentsyncImplContentSyncManagerImplProperties
///
/// Properties:
/// * [contentsyncPeriodFallbackPeriodAuthorizable] 
/// * [contentsyncPeriodFallbackPeriodUpdateuser] 
@BuiltValue()
abstract class ComDayCqContentsyncImplContentSyncManagerImplProperties implements Built<ComDayCqContentsyncImplContentSyncManagerImplProperties, ComDayCqContentsyncImplContentSyncManagerImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'contentsync.fallback.authorizable')
  ConfigNodePropertyString? get contentsyncPeriodFallbackPeriodAuthorizable;

  @BuiltValueField(wireName: r'contentsync.fallback.updateuser')
  ConfigNodePropertyString? get contentsyncPeriodFallbackPeriodUpdateuser;

  ComDayCqContentsyncImplContentSyncManagerImplProperties._();

  factory ComDayCqContentsyncImplContentSyncManagerImplProperties([void updates(ComDayCqContentsyncImplContentSyncManagerImplPropertiesBuilder b)]) = _$ComDayCqContentsyncImplContentSyncManagerImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqContentsyncImplContentSyncManagerImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqContentsyncImplContentSyncManagerImplProperties> get serializer => _$ComDayCqContentsyncImplContentSyncManagerImplPropertiesSerializer();
}

class _$ComDayCqContentsyncImplContentSyncManagerImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqContentsyncImplContentSyncManagerImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqContentsyncImplContentSyncManagerImplProperties, _$ComDayCqContentsyncImplContentSyncManagerImplProperties];

  @override
  final String wireName = r'ComDayCqContentsyncImplContentSyncManagerImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqContentsyncImplContentSyncManagerImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.contentsyncPeriodFallbackPeriodAuthorizable != null) {
      yield r'contentsync.fallback.authorizable';
      yield serializers.serialize(
        object.contentsyncPeriodFallbackPeriodAuthorizable,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.contentsyncPeriodFallbackPeriodUpdateuser != null) {
      yield r'contentsync.fallback.updateuser';
      yield serializers.serialize(
        object.contentsyncPeriodFallbackPeriodUpdateuser,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqContentsyncImplContentSyncManagerImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqContentsyncImplContentSyncManagerImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'contentsync.fallback.authorizable':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.contentsyncPeriodFallbackPeriodAuthorizable.replace(valueDes);
          break;
        case r'contentsync.fallback.updateuser':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.contentsyncPeriodFallbackPeriodUpdateuser.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqContentsyncImplContentSyncManagerImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqContentsyncImplContentSyncManagerImplPropertiesBuilder();
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

