//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/com_day_cq_dam_s7dam_common_servlets_s7dam_product_info_servlet_properties.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_s7dam_common_servlets_s7dam_product_info_servlet_info.g.dart';

/// ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo
///
/// Properties:
/// * [pid] 
/// * [title] 
/// * [description] 
/// * [properties] 
@BuiltValue()
abstract class ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo implements Built<ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo, ComDayCqDamS7damCommonServletsS7damProductInfoServletInfoBuilder> {
  @BuiltValueField(wireName: r'pid')
  String? get pid;

  @BuiltValueField(wireName: r'title')
  String? get title;

  @BuiltValueField(wireName: r'description')
  String? get description;

  @BuiltValueField(wireName: r'properties')
  ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties? get properties;

  ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo._();

  factory ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo([void updates(ComDayCqDamS7damCommonServletsS7damProductInfoServletInfoBuilder b)]) = _$ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamS7damCommonServletsS7damProductInfoServletInfoBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo> get serializer => _$ComDayCqDamS7damCommonServletsS7damProductInfoServletInfoSerializer();
}

class _$ComDayCqDamS7damCommonServletsS7damProductInfoServletInfoSerializer implements PrimitiveSerializer<ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo> {
  @override
  final Iterable<Type> types = const [ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo, _$ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo];

  @override
  final String wireName = r'ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.pid != null) {
      yield r'pid';
      yield serializers.serialize(
        object.pid,
        specifiedType: const FullType(String),
      );
    }
    if (object.title != null) {
      yield r'title';
      yield serializers.serialize(
        object.title,
        specifiedType: const FullType(String),
      );
    }
    if (object.description != null) {
      yield r'description';
      yield serializers.serialize(
        object.description,
        specifiedType: const FullType(String),
      );
    }
    if (object.properties != null) {
      yield r'properties';
      yield serializers.serialize(
        object.properties,
        specifiedType: const FullType(ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamS7damCommonServletsS7damProductInfoServletInfoBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'pid':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.pid = valueDes;
          break;
        case r'title':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.title = valueDes;
          break;
        case r'description':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.description = valueDes;
          break;
        case r'properties':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties),
          ) as ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties?;
          if (valueDes == null) continue;
          result.properties.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamS7damCommonServletsS7damProductInfoServletInfoBuilder();
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

