//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl_properties.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl_info.g.dart';

/// ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo
///
/// Properties:
/// * [pid] 
/// * [title] 
/// * [description] 
/// * [properties] 
@BuiltValue()
abstract class ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo implements Built<ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo, ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfoBuilder> {
  @BuiltValueField(wireName: r'pid')
  String? get pid;

  @BuiltValueField(wireName: r'title')
  String? get title;

  @BuiltValueField(wireName: r'description')
  String? get description;

  @BuiltValueField(wireName: r'properties')
  ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties? get properties;

  ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo._();

  factory ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo([void updates(ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfoBuilder b)]) = _$ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfoBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo> get serializer => _$ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfoSerializer();
}

class _$ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfoSerializer implements PrimitiveSerializer<ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo> {
  @override
  final Iterable<Type> types = const [ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo, _$ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo];

  @override
  final String wireName = r'ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo object, {
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
        specifiedType: const FullType(ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfoBuilder result,
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
            specifiedType: const FullType.nullable(ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties),
          ) as ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties?;
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
  ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfoBuilder();
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

