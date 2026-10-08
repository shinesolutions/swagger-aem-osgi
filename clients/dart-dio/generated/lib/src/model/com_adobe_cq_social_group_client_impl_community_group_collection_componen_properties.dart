//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties.g.dart';

/// ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties
///
/// Properties:
/// * [groupPeriodListingPeriodPaginationPeriodEnable] 
/// * [groupPeriodListingPeriodLazyloadingPeriodEnable] 
/// * [pagePeriodSize] 
/// * [priority] 
@BuiltValue()
abstract class ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties implements Built<ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties, ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenPropertiesBuilder> {
  @BuiltValueField(wireName: r'group.listing.pagination.enable')
  ConfigNodePropertyBoolean? get groupPeriodListingPeriodPaginationPeriodEnable;

  @BuiltValueField(wireName: r'group.listing.lazyloading.enable')
  ConfigNodePropertyBoolean? get groupPeriodListingPeriodLazyloadingPeriodEnable;

  @BuiltValueField(wireName: r'page.size')
  ConfigNodePropertyInteger? get pagePeriodSize;

  @BuiltValueField(wireName: r'priority')
  ConfigNodePropertyInteger? get priority;

  ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties._();

  factory ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties([void updates(ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenPropertiesBuilder b)]) = _$ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties> get serializer => _$ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenPropertiesSerializer();
}

class _$ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties, _$ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties];

  @override
  final String wireName = r'ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.groupPeriodListingPeriodPaginationPeriodEnable != null) {
      yield r'group.listing.pagination.enable';
      yield serializers.serialize(
        object.groupPeriodListingPeriodPaginationPeriodEnable,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.groupPeriodListingPeriodLazyloadingPeriodEnable != null) {
      yield r'group.listing.lazyloading.enable';
      yield serializers.serialize(
        object.groupPeriodListingPeriodLazyloadingPeriodEnable,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.pagePeriodSize != null) {
      yield r'page.size';
      yield serializers.serialize(
        object.pagePeriodSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.priority != null) {
      yield r'priority';
      yield serializers.serialize(
        object.priority,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'group.listing.pagination.enable':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.groupPeriodListingPeriodPaginationPeriodEnable.replace(valueDes);
          break;
        case r'group.listing.lazyloading.enable':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.groupPeriodListingPeriodLazyloadingPeriodEnable.replace(valueDes);
          break;
        case r'page.size':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.pagePeriodSize.replace(valueDes);
          break;
        case r'priority':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.priority.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenPropertiesBuilder();
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

