//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_startupfilter_impl_startup_filter_impl_properties.g.dart';

/// OrgApacheSlingStartupfilterImplStartupFilterImplProperties
///
/// Properties:
/// * [activePeriodByPeriodDefault] 
/// * [defaultPeriodMessage] 
@BuiltValue()
abstract class OrgApacheSlingStartupfilterImplStartupFilterImplProperties implements Built<OrgApacheSlingStartupfilterImplStartupFilterImplProperties, OrgApacheSlingStartupfilterImplStartupFilterImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'active.by.default')
  ConfigNodePropertyBoolean? get activePeriodByPeriodDefault;

  @BuiltValueField(wireName: r'default.message')
  ConfigNodePropertyString? get defaultPeriodMessage;

  OrgApacheSlingStartupfilterImplStartupFilterImplProperties._();

  factory OrgApacheSlingStartupfilterImplStartupFilterImplProperties([void updates(OrgApacheSlingStartupfilterImplStartupFilterImplPropertiesBuilder b)]) = _$OrgApacheSlingStartupfilterImplStartupFilterImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingStartupfilterImplStartupFilterImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingStartupfilterImplStartupFilterImplProperties> get serializer => _$OrgApacheSlingStartupfilterImplStartupFilterImplPropertiesSerializer();
}

class _$OrgApacheSlingStartupfilterImplStartupFilterImplPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingStartupfilterImplStartupFilterImplProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingStartupfilterImplStartupFilterImplProperties, _$OrgApacheSlingStartupfilterImplStartupFilterImplProperties];

  @override
  final String wireName = r'OrgApacheSlingStartupfilterImplStartupFilterImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingStartupfilterImplStartupFilterImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.activePeriodByPeriodDefault != null) {
      yield r'active.by.default';
      yield serializers.serialize(
        object.activePeriodByPeriodDefault,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.defaultPeriodMessage != null) {
      yield r'default.message';
      yield serializers.serialize(
        object.defaultPeriodMessage,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingStartupfilterImplStartupFilterImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingStartupfilterImplStartupFilterImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'active.by.default':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.activePeriodByPeriodDefault.replace(valueDes);
          break;
        case r'default.message':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.defaultPeriodMessage.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingStartupfilterImplStartupFilterImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingStartupfilterImplStartupFilterImplPropertiesBuilder();
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

